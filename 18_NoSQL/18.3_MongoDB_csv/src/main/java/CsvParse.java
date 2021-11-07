import au.com.bytecode.opencsv.CSVReader;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParse {

  private static final String FILE = "C:\\Users\\home\\IdeaProjects\\java_basics\\18_NoSQL\\18.3_MongoDB_csv\\src\\main\\resources\\mongo.csv";
  private List<String[]> allRows;
  private List<DBObject> docs = new ArrayList<>();

  //получение данных из csv файла и сохранение в массив
  private List<String[]> file() throws IOException {

    CSVReader reader = new CSVReader(new FileReader(FILE), ',', '"', 1);
    allRows = reader.readAll();
//    for (String[] row : allRows) {
//      System.out.println(Arrays.toString(row));
//    }
    return allRows;
  }

  //преобразование List<String[]> в List<DBObject>
  public List<DBObject> allDocs() throws IOException {
    file();
    for (int i = 0; i < allRows.size(); i++) {
      DBObject doc1 = new BasicDBObject();
      doc1.put("Name", allRows.get(i)[0].trim());
      doc1.put("Age", allRows.get(i)[1]);
      doc1.put("Courses", allRows.get(i)[2]);
      docs.add(doc1);
    }
    return docs;
  }


}

