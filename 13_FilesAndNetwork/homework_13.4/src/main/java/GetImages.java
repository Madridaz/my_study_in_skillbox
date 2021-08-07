import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;

public class GetImages {
    List<String> allLinks = new ArrayList<>();

    //получение и возврат объекта Document из URL
    public Document getDocumentFromWeb() throws IOException {
        Document doc = Jsoup.connect("http://lenta.ru/").get();
        String title = doc.title();
        System.out.println(title);
        return doc;
    }

    //получение всех абсолютных URL картинок
    public List<String> getAllLinks(Document document) {
        Elements aElements = document.getElementsByTag("img");
        for (Element aElement : aElements) {
            allLinks.add(aElement.attr("src"));
        }
        return allLinks;
    }

    // Вывод в консоль списка всех абсолютных URL картинок
    public void printAllLinks() {
        for (int i = 0; i < allLinks.size(); i++) {
            System.out.println(allLinks.get(i));
        }
    }

    //скачивает выбранный файл и сохраняет в папке
    public void saveImgFileToFolder() {
        String way = "data/images/";

        for (int i = 0; i < allLinks.size(); i++) {
            String originalName = allLinks.get(i).replace("https://icdn.lenta.ru/images/","");
            String originalName2 = originalName.replaceAll("\\d+/","");
           // String type = ".jpg";
            try (BufferedInputStream in = new BufferedInputStream(new URL(allLinks.get(i)).openStream());
                 FileOutputStream fileOutputStream = new FileOutputStream(way + originalName2)) {
                byte dataBuffer[] = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}



