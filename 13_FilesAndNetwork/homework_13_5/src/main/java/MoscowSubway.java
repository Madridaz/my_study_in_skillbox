import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;

public class MoscowSubway {
    private static final String WEB_SITE = "https://www.moscowmap.ru/metro.html#lines";
    private static final String FILENAME = "C:\\Users\\home\\IdeaProjects\\java_basics\\13_FilesAndNetwork\\homework_13_5\\src\\main\\resources\\MoscowSubwayMap.json";

    Document doc = getDocumentFromFile();
    LinkedHashMap<String, String> linesAndStations = getAllLinesAndStations();

    public MoscowSubway() throws IOException {
    }

    //Получение кода страницы из файла
    private Document getDocumentFromFile() throws IOException {
        File htmlFile = new File("C:\\Users\\home\\IdeaProjects\\java_basics\\13_FilesAndNetwork\\homework_13_5\\src\\main\\resources\\info.html");
        Document doc = Jsoup.parse(htmlFile, "UTF-8");
        return doc;
    }

    //Получение всех линий и станций в одну мапу
    public LinkedHashMap<String, String> getAllLinesAndStations() throws IOException {
        LinkedHashMap<String, String> linesAndStations = new LinkedHashMap<>();
        Elements lines = getDocumentFromFile().select(".js-metro-line");
        Elements stations = getDocumentFromFile().select(".js-metro-stations");
        for (int i = 0; i < lines.size(); i++) {
            String key = lines.get(i).text();
            String value = stations.get(i).text().replaceAll("[0-9]+", "");
           String valueCut =  value.replace(" .", ", ");
           String valueCut1 =  valueCut.replace(".", "");

            linesAndStations.put(key, valueCut1);
        }
        return linesAndStations;
    }

    //создание JSON файла и сохранение его в папку
    public void createJsonFile() {
        JSONObject object = new JSONObject();
        JSONArray lines = new JSONArray();
        JSONArray stations = new JSONArray();
        for (String key : linesAndStations.keySet()) {
            lines.add(key);
        }
        for (String value : linesAndStations.values()) {
            stations.add(value.replaceAll("\u00a0", ""));
        }
        object.put("lines", lines);
        object.put("stations", stations);


        try (FileWriter writer = new FileWriter(FILENAME)) {
            writer.write(object.toString());
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

