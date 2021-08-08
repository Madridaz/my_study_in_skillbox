import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MoscowSubway moscowSubway = new MoscowSubway();

        System.out.println("номера и название линий");
        System.out.println(moscowSubway.lines);
        System.out.println();
        System.out.println("номер линии и название станции");
        System.out.println(moscowSubway.stations);


    }
}
