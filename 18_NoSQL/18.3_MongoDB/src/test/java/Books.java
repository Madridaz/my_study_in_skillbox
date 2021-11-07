import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

public class Books {

  private DBObject doc1 = new BasicDBObject();
  private DBObject doc2 = new BasicDBObject();
  private DBObject doc3 = new BasicDBObject();
  private DBObject doc4 = new BasicDBObject();
  private DBObject doc5 = new BasicDBObject();
  private DBObject doc6 = new BasicDBObject();
  private DBObject doc7 = new BasicDBObject();

  public List<DBObject> addBooks() {
    List<DBObject> documents = new ArrayList<>();
    doc1.put("Title", "Жена башмачника");
    doc1.put("Author", "Адриана Трижиани");
    doc1.put("Year", 2007);

    doc2.put("Title", "Случайная вакансия");
    doc2.put("Author", "Дж.К.Роулинг");
    doc2.put("Year", 2010);

    doc3.put("Title", "Империя ангелов");
    doc3.put("Author", "Бернар Вербер");
    doc3.put("Year", 1998);

    doc4.put("Title", "Атлант расправил плечи");
    doc4.put("Author", "Айн Ренд");
    doc4.put("Year", 1965);

    doc5.put("Title", "На пороге чудес");
    doc5.put("Author", "Энн Патчетт");
    doc5.put("Year", 1989);

    doc6.put("Title", "Убийство в Восточном Экспрессе");
    doc6.put("Author", "Агата Кристи");
    doc6.put("Year", 1949);

    doc7.put("Title", "Десять негритят");
    doc7.put("Author", "Агата Кристи");
    doc7.put("Year", 1937);

    documents.add(doc1);
    documents.add(doc2);
    documents.add(doc3);
    documents.add(doc4);
    documents.add(doc5);
    documents.add(doc6);
    documents.add(doc7);

    return documents;
  }

}
