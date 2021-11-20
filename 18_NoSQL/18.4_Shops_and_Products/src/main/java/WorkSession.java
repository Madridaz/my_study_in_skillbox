import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;

public class WorkSession {

  DBCollection marketCollection;
  DBCollection productCollection;
  List<DBObject> products = new ArrayList<>();

  public List<DBObject> getProducts(DBObject s) {
    return products;
  }

  public void setProducts(List<DBObject> products) {
    this.products = products;
  }

  //запуск клиента, создание коллекций
  public WorkSession() {
    MongoClient mongo = new MongoClient("localhost", 27017);
    DB db = mongo.getDB("local");
    DB db1 = mongo.getDB("local");
    marketCollection = db.getCollection("markets");
    productCollection = db1.getCollection("products");
//    marketCollection.drop();
//    productCollection.drop();
  }

  //добавление товара
  public void addProduct(String name, int price) {
    DBObject DBObject = new BasicDBObject();
    DBObject.put("name", name);
    DBObject.put("price", price);
    productCollection.insert(DBObject);
  }

  //добавление магазина
  public void addMarket(String name) {
    DBObject DBObject = new BasicDBObject();
    DBObject.put("name", name);
    DBObject.put("list", products);
    marketCollection.insert(DBObject);
  }

  //добавление товара в магазин
  public void addProductToMarket(String product, String market) {
    //получение добавляемого продукта из коллекции
    DBObject oneProduct = productCollection.findOne(new BasicDBObject("name", product));

    //добавление полученного продукта в нужный магазин
    marketCollection.findAndModify(new BasicDBObject("name", market),
        new BasicDBObject("$push", new BasicDBObject("list", oneProduct)));
  }

  //вывод статистики
  public void stats() {
    MongoClient mongoClient = new MongoClient(
        new MongoClientURI(
            "mongodb://localhost:27017/?readPreference=primary&appname=MongoDB+Compass&directConnection=true&ssl=false"));

    MongoDatabase db = mongoClient.getDatabase("local");
    MongoCollection<Document> col = db.getCollection("markets");
    MongoDatabase db1 = mongoClient.getDatabase("local");
    MongoCollection<Document> col1 = db.getCollection("products");

    AggregateIterable<Document> res = col.aggregate(Arrays.asList(new Document("$unwind",
            new Document("path", "$list")),
        new Document("$group",
            new Document("_id", "$name")
                .append("Сумма всех товаров магазина: ",
                    new Document("$sum", "$list.price"))
                .append("Максимальная цена товара в магазине: ",
                    new Document("$max", "$list.price"))
                .append("Минимальная цена товара в магазине: ",
                    new Document("$min", "$list.price"))
                .append("Средняя цена товаров в магазине: ",
                    new Document("$avg", "$list.price"))
                .append("Цены всех товаров: ",
                    new Document("$push", "$list.price")))));

    for (Document d : res) {
      System.out.println(d.toJson());
    }

    AggregateIterable<Document> res1 = col1.aggregate(Arrays.asList(new Document("$match",
            new Document("price",
                new Document("$lt", 100L))),
        new Document("$count", "количество товаров дешевле 100 р")));

    for (Document d : res1) {
      System.out.println(d.toJson());
    }

  }
}
