import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.mongodb.client.model.Aggregates.*;

public class WorkSession {

  DBCollection marketCollection;
  DBCollection productCollection;
  List<DBObject> products = new ArrayList<>();

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

  }
}
