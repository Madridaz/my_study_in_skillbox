import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
import java.util.function.Consumer;
import org.bson.BsonDocument;
import org.bson.Document;

public class Main {

  public static void main(String[] args) {
    MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
    MongoDatabase database = mongoClient.getDatabase("local");

    // Создаем коллекцию
    MongoCollection<Document> collection = database.getCollection("books");
    Books books = new Books();

    //очистка коллекции от старых документов
    collection.drop();

    // Вставляем документы в коллекцию
    collection.insertOne(books.doc1);
    collection.insertOne(books.doc2);
    collection.insertOne(books.doc3);
    collection.insertOne(books.doc4);
    collection.insertOne(books.doc5);

    //вывод коллекции на экран
    System.out.println("Содержимое коллекции: ");
    collection.find().forEach((Consumer<Document>) document -> {
      System.out.println(document);
    });

    collection.drop();


  }

}
