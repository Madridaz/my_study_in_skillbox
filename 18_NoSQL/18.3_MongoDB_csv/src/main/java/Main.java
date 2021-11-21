import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import java.io.IOException;


public class Main {

  public static void main(String[] args) throws IOException {
    MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
    DB db = mongoClient.getDB("local");

    DBCollection collection = db.getCollection("students");
    collection.drop();

    //Заполнение БД данными из csv файла
    CsvParse csvParse = new CsvParse();
    collection.insert(csvParse.allDocs());

    //Получение количества студентов в БД
    long studentsCount = collection.count();
    System.out.println("Количество студентов в базе: " + studentsCount + " человек.");

    //Получение количества студентов старше 40 лет
//    int countOldStudents = collection.find(new BasicDBObject("Age", new BasicDBObject("$gt", 40))).count();
//    System.out.println(countOldStudents);
    DBCursor oldStudents = collection.find().sort(new BasicDBObject("Age", -1));
    int countOld = 0;
    while (oldStudents.hasNext()) {
      DBObject obj3 = oldStudents.next();
      int result = Integer.parseInt(obj3.get("Age").toString());
      if (result > 40) {
        countOld++;
      }
    }
    System.out.println("Количество студентов старше 40 лет: " + countOld + " человек.");

    //Получение имени самого молодого студента
    DBCursor theYoungestStudent = collection.find().sort(new BasicDBObject("Age", 1)).limit(1);
    while (theYoungestStudent.hasNext()) {
      DBObject obj1 = theYoungestStudent.next();
      System.out.println(
          "Самого молодого студента зовут: " + obj1.get("Name") + ", его возраст: " + obj1.get(
              "Age") + " лет.");
    }
    //Получение списка курсов самого старого студента
    DBCursor allCourses = collection.find().sort(new BasicDBObject("Age", -1)).limit(1);
    while (allCourses.hasNext()) {
      DBObject obj2 = allCourses.next();
      System.out.println(
          "Список курсов самого старого студента: " + obj2.get("Courses") + " (" + obj2.get("Name")
              + ", "
              + obj2.get("Age") + " года)");
    }

  }

}

