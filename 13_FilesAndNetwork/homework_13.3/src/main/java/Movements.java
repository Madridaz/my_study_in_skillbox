import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movements {

    private String accountType;
    private String accountNumber;
    private String currency;
    private String operationDate;
    private String reference;
    private String detailsOfOperation;
    private double income;
    private double expense;
    List<Movements> allLines = new ArrayList<>();

    public Movements(String accountType, String accountNumber, String currency, String operationDate, String reference, String detailsOfOperation, double income, double expense) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.operationDate = operationDate;
        this.reference = reference;
        this.detailsOfOperation = detailsOfOperation;
        this.income = income;
        this.expense = expense;
    }

    @Override
    public String toString() {
        return "accountType: " + accountType + "\n" +
                "accountNumber: " + accountNumber + "\n" +
                "currency: " + currency + "\n" +
                "operationDate: " + operationDate + "\n" +
                "reference: " + reference + "\n" +
                "detailsOfOperation: " + detailsOfOperation + "\n" +
                "income: " + income + "\n" +
                "expense: " + expense + "\n";
    }

    public Movements(String pathMovementsCsv) {
    }

    public void readFile(String file) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(file), ',', '"', 1);
        String[] nextLine;

        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                //System.out.println(Arrays.toString(nextLine));
                nextLine[7].replace("\"", "");
                nextLine[7].replace(",", ".");


                try {
                    allLines.add(new Movements(nextLine[0], nextLine[1], nextLine[2],
                            nextLine[3], nextLine[4], nextLine[5], Double.parseDouble(nextLine[6]),
                            Double.parseDouble(nextLine[7])));

                } catch (NumberFormatException e) {
                    System.err.println("дробное число не добавлено");
                }
            }
        }
    }

    public double getExpenseSum() {

        return 0.0;
    }

    public double getIncomeSum() {

        return 0.0;
    }
}

