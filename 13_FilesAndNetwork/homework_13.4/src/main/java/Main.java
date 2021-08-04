import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GetImages getImages = new GetImages();

        getImages.getAllLinks(getImages.getDocumentFromWeb());

        getImages.printAllLinks();

        getImages.saveImgFileToFolder();


    }
}
