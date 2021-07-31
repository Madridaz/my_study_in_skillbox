import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите путь до папки");
        String s = reader.readLine();


        System.out.println("Размер папки составляет: " + convertFolderSizeToMb(FileUtils.calculateFolderSize(s)) + " мегабайт");
    }

    public static double convertFolderSizeToMb(long size) {

        return size / 1024 / 1024;
    }
}
