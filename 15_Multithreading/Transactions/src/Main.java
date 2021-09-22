import java.util.Scanner;

public class Main extends Thread {
    private static final String head = "Добро пожаловать в виртуальный банк JAVA Transfer" + "\n" +
            "Для вывода на экран всех клиентов введите show" + "\n" +
            "Для осуществления перевода денежных средств введите информацию (Пример: 1, 2, 30000)";
    private static final String lowMoney = "Сумма перевода больше, чем остаток на счету отправителя";

    private static void input(String s, Bank bank) throws InterruptedException {

        if (s.matches("([0-9])+,\\s([0-9])+,\\s([0-9])+")) {
            String[] data = s.split(", ");
            String from = data[0];
            String to = data[1];
            Long amount = Long.valueOf(data[2]);

            System.out.println("Данные перед операцией");
            System.out.print(bank.getAccounts().get(from));
            System.out.println(bank.getAccounts().get(to));
            System.out.println("...операция выполняется..." + "\n");
            Thread.sleep(4000);
            if (amount > bank.getAccounts().get(from).getMoney()) {
                System.out.println(lowMoney);

            } else
                bank.transfer(from, to, amount);

            System.out.println("Данные после операции");
            System.out.print(bank.getAccounts().get(from));
            System.out.println(bank.getAccounts().get(to));

        } else if (s.matches("show")) {
            System.out.println(bank.getAccounts());

        } else System.out.println("неверный ввод");
    }

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        System.out.println(head);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            Thread.sleep(1000);
            input(s, bank);

        }
    }
}

