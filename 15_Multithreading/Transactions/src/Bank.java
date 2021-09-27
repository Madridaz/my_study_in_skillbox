import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Bank {
    private Map<String, Account> accounts = new LinkedHashMap<>();
    private final Random random = new Random();
    private static final String YES = "Служба Безопасности одобрила перевод";
    private static final String NO = "Служба Безопасности отклонила перевод";
    private static final String CHECK = "Подождите, пожалуйста, операция проверяется Службой Безопасности банка";

    public Bank() {
        createAccounts();
    }

    //создание клиентской базы у объекта Bank
    private Map<String, Account> createAccounts() {
        int a = 1000000000;
        int b = 10000;
        for (int i = 1; i < 11; i++) {
            String id = String.valueOf(i);
            long money = Math.abs(random.nextLong() / a);
            accounts.put(id, new Account(money / b, id));
        }
        return accounts;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    public void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        Account from = accounts.get(fromAccountNum);
        Account to = accounts.get(toAccountNum);
        String info = "Транзакция прошла успешно! " + "Аккаунт №" + from.getAccNumber() + " перевел " + "Аккаунту №" + to.getAccNumber() + " " + amount + " рублей.";

        if (amount < 50000) {
            from.setMoney(from.getMoney() - amount);
            to.setMoney(to.getMoney() + amount);
            System.out.println(info);
        } else if (amount >= 50000) {
            System.out.println(CHECK);
            Thread.sleep(4000);
            boolean confirm = isFraud(from.getAccNumber(), to.getAccNumber(), amount);
            if (confirm == true) {
                from.setMoney(from.getMoney() - amount);
                to.setMoney(to.getMoney() + amount);
                System.out.println(YES);
                System.out.println(info);
            } else
                System.out.println(NO);

        }
    }

    public long getBalance(String accountNum) {
        return accounts.get(accountNum).getMoney();
    }
}
