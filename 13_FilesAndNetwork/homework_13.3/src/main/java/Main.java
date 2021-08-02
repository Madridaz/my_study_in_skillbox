import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final String FILE_TO_READ = "C:\\Users\\home\\IdeaProjects\\java_basics\\13_FilesAndNetwork\\files\\movementList.csv";
        Movements movements = new Movements(FILE_TO_READ);

        movements.readFile(FILE_TO_READ);

        System.out.println("Сумма расходов: " + movements.getExpenseSum() + " руб.");
        System.out.println("Сумма доходов: " + movements.getIncomeSum() + " руб.");
        movements.getAllExpense();


    }


}
