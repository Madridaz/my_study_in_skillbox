import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MoscowSubway moscowSubway = new MoscowSubway();
        moscowSubway.getAllLinesAndStations();

        System.out.println(moscowSubway.linesAndStations.keySet());
        String s = moscowSubway.linesAndStations.get("Сокольническая линия");
        System.out.println(s);


        moscowSubway.createJsonFile();
    }
}
