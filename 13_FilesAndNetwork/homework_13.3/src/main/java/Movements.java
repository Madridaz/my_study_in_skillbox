import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Movements {

    private String accountType;
    private String accountNumber;
    private String currency;
    private String operationDate;
    private String reference;
    private String detailsOfOperation;
    private double income;
    private double expense;
    private double resultExpense;
    private double resultIncome;
    List<Movements> allLines = new ArrayList<>();
    private static final NumberFormat format = NumberFormat.getInstance(new Locale("ru"));

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
                nextLine[7].replace("\"", "");
                nextLine[7].replace(",", ".");


                try {
                    allLines.add(new Movements(nextLine[0], nextLine[1], nextLine[2],
                            nextLine[3], nextLine[4], nextLine[5], Double.parseDouble(nextLine[6]),
                            format.parse(nextLine[7]).doubleValue()));

                } catch (NumberFormatException | ParseException e) {
                    System.err.println("дробное число не добавлено");
                }
            }
        }
    }

    public double getExpenseSum() {
        for (int i = 0; i < allLines.size(); i++) {
            resultExpense += allLines.get(i).expense;
        }
        return resultExpense;
    }

    public double getIncomeSum() {
        for (int i = 0; i < allLines.size(); i++) {
            resultIncome += allLines.get(i).income;
        }
        return resultIncome;
    }

    public void getAllExpense() {
        List<String> info = new ArrayList<>();
        for (int i = 0; i < allLines.size(); i++) {
            String cut = allLines.get(i).detailsOfOperation.replace("548673++++++1028", "");
            cut.replaceAll(" .*", "");

            info.add(cut + " - сумма: " + allLines.get(i).expense + " рублей");
        }
        Collections.sort(info);
        for (int i = 0; i < info.size(); i++) {
            System.out.println(info.get(i));
        }
    }
}

