import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MoscowSubway {
    private static final String WEB_SITE = "https://www.moscowmap.ru/metro.html#lines";
    private static final String FILENAME = "C:\\Users\\home\\IdeaProjects\\java_basics\\13_FilesAndNetwork\\homework_13_5\\src\\main\\resources\\MoscowSubwayMap.json";

    Document doc = getDocumentFromFile();
    LinkedHashMap<String, String> lines = getAllLines();
    LinkedHashMap<String, LinkedHashSet<String>> stations = getAllStations();

    public MoscowSubway() throws IOException {
    }

    //    //Получение кода страницы сайта метрополитена
//    public Document getDocumentFromWeb() throws IOException {
//        Document doc = Jsoup.connect(WEB_SITE).maxBodySize(0).get();
//        return doc;
//    }

    //Получение кода страницы из файла
    private Document getDocumentFromFile() throws IOException {
        File htmlFile = new File("C:\\Users\\home\\IdeaProjects\\java_basics\\13_FilesAndNetwork\\homework_13_5\\src\\main\\resources\\info.html");
        Document doc = Jsoup.parse(htmlFile, "UTF-8");
        return doc;
    }

    //Получение всех линий метро
    private LinkedHashMap<String, String> getAllLines() throws IOException {
        Elements elements = getDocumentFromFile().select(".js-metro-line");
        LinkedHashMap<String, String> lines = new LinkedHashMap<>();
        for (int i = 0; i < elements.size(); i++) {
            String key = elements.get(i).attr("data-line");
            String value = elements.get(i).text();
            lines.put(key, value);
        }
        return lines;
    }

    //Получение всех станций метро
    private LinkedHashMap<String, LinkedHashSet<String>> getAllStations() throws IOException {
        Elements elements = getDocumentFromFile().select(".js-metro-stations");
        LinkedHashMap<String, LinkedHashSet<String>> stations = new LinkedHashMap<>();
        LinkedHashSet<String> group = new LinkedHashSet<>();
        for (int i = 0; i < elements.size(); i++) {
            String key = elements.get(i).attr("data-line");
            String value = elements.get(i).text().replaceAll("[0-9]+\\.", "");
            String value1 = value.replaceAll("\\h", " ");
            group.add(value1);
            stations.put(key, group);
        }
        return stations;
    }

    //создание JSON файла и сохранение его в папку
    private void createJsonFile() {
        JSONObject object = new JSONObject();
        object.put("connections", "???");
        object.put("stations", stations);
        object.put("lines", lines);

        try (
                FileWriter writer = new FileWriter(FILENAME)) {
            writer.write(object.toJSONString());
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

