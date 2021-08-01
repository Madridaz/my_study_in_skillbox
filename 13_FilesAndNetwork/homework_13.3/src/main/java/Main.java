import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        final String FILE_TO_READ = "C:\\Users\\home\\IdeaProjects\\java_basics\\13_FilesAndNetwork\\files\\movementList.csv";
        Movements movements = new Movements(FILE_TO_READ);


        movements.readFile(FILE_TO_READ);
        System.out.println("проверка");
        System.out.println(movements.allLines);




    }
}
