import java.util.concurrent.atomic.AtomicInteger;

public class TestOperation extends Thread {
    Bank bank;
    private static final String lowMoney = "Сумма перевода больше, чем остаток на счету отправителя";
    private static AtomicInteger id = new AtomicInteger();
    private String s;

    public TestOperation(Bank bank, String s) {
        this.bank = bank;
        this.s = s;
    }

    @Override
    public void run() {
        String name = "Транзакция";

        Thread.currentThread().setName(name + " # " + id.incrementAndGet());
        System.out.println("Запуск потока: " + Thread.currentThread().getName());

        if (s.matches("([0-9])+,\\s([0-9])+,\\s([0-9])+")) {
            String[] data = s.split(", ");
            String from = data[0];
            String to = data[1];
            Long amount = Long.valueOf(data[2]);

            System.out.println("Данные перед операцией");
            System.out.print(bank.getAccounts().get(from));
            System.out.println(bank.getAccounts().get(to));
            System.out.println("...операция выполняется..." + "\n");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (amount > bank.getAccounts().get(from).getMoney()) {
                System.out.println(lowMoney);

            } else {
                try {
                    bank.transfer(from, to, amount);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Данные после операции");
            System.out.print(bank.getAccounts().get(from));
            System.out.println(bank.getAccounts().get(to));
            System.out.println("Поток " + Thread.currentThread().getName() + " завершился." + "\n");

        } else System.out.println("неверный ввод");

    }
}
