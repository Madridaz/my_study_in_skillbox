import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MoscowSubway {
    final String WEB_SITE = "https://www.moscowmap.ru/metro.html#lines";
    Document doc = getDocumentFromFile();
    Map<String, String> lines = getAllLines();
    Map<String, String> stations = getAllStations();

    public MoscowSubway() throws IOException {
    }


//    //Получение кода страницы сайта метрополитена
//    public Document getDocumentFromWeb() throws IOException {
//        Document doc = Jsoup.connect(WEB_SITE).maxBodySize(0).get();
//        return doc;
//    }

    //Получение кода страницы из файла
    public Document getDocumentFromFile() throws IOException {

        File htmlFile = new File("C:\\Users\\home\\IdeaProjects\\java_basics\\13_FilesAndNetwork\\homework_13_5\\src\\main\\resources\\info.html");
        Document doc = Jsoup.parse(htmlFile, "UTF-8");
        return doc;
    }

    //Получение всех линий метро
    public Map<String, String> getAllLines() throws IOException {
        Elements elements = getDocumentFromFile().select(".js-metro-line");
        Map<String, String> lines = new HashMap<>();
        for (int i = 0; i < elements.size(); i++) {
            lines.put(elements.get(i).attr("data-line"), elements.get(i).text());
        }
        return lines;
    }

    //Получение всех станций метро
    public Map<String, String> getAllStations() throws IOException {
        Elements elements = getDocumentFromFile().select(".js-metro-stations");
        Map<String, String> stations = new HashMap<>();
        for (int i = 0; i < elements.size(); i++) {
            stations.put(elements.get(i).attr("data-line"), elements.get(i).text());
        }
        return stations;
    }

}

