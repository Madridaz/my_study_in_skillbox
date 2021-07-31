import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите откуда нужно скопировать");
        String sourceFolder = reader.readLine();
        System.out.println("Введите куда нужно скопировать");
        String destinationFolder = reader.readLine();

        FileUtils.copyFolder(sourceFolder, destinationFolder);
        System.out.println("Копирование завершено");
    }
}
