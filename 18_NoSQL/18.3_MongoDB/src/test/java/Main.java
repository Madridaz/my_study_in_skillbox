import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class Main {

  public static void main(String[] args) {
    MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
    DB db = mongoClient.getDB("local");
    Books books = new Books();

    // Создаем коллекцию, заполняем документами
    DBCollection collection = db.getCollection("books");
    collection.drop();
    collection.insert(books.addBooks());

    //Сортировка и поиск самой старой книги
    DBCursor oldBook = collection
        .find()
        .sort(new BasicDBObject("Year", 1)).limit(1);
    System.out.println("Выборка самой старой книги");

    while (oldBook.hasNext()) {
      DBObject obj1 = oldBook.next();
      System.out.println("Название: " + obj1.get("Title") + "\n" +
          "Автор: " + obj1.get("Author") + "\n" +
          "Год: " + obj1.get("Year") + "\n");

      //Поиск всех книг одного автора
      DBCursor sameAuthor = collection
          .find(new BasicDBObject("Author", "Агата Кристи"))
          .sort(new BasicDBObject("Year", 1));
      System.out.println("Выборка всех книг одного автора");

      while (sameAuthor.hasNext()) {
        DBObject obj2 = sameAuthor.next();
        System.out.println("Название: " + obj2.get("Title") + "\n" +
            "Автор: " + obj2.get("Author") + "\n" +
            "Год: " + obj2.get("Year"));
      }
    }
  }
}
