import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Bank {
    private Map<String, Account> accounts = new LinkedHashMap<>();
    private Map<String, Account> blockedAccounts = new LinkedHashMap<>();
    private final Random random = new Random();

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

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами. Если сумма транзакции > 50000,
     * то после совершения транзакции, она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка счетов (как – на ваше
     * усмотрение)
     */
    public void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        Account from = accounts.get(fromAccountNum);
        Account to = accounts.get(toAccountNum);

        if (amount < 50000) {
            from.setMoney(from.getMoney() - amount);
            to.setMoney(to.getMoney() + amount);
        } else if (amount >= 50000) {
            System.out.println("Подождите, пожалуйста, операция проверяется Службой Безопасности банка" + "\n");
            Thread.sleep(4000);
            boolean confirm = isFraud(from.getAccNumber(), to.getAccNumber(), amount);
            if (confirm == true) {
                from.setMoney(from.getMoney() - amount);
                to.setMoney(to.getMoney() + amount);
                System.out.println("Служба Безопасности одобрила перевод" + "\n");
            } else
                System.out.println("Служба Безопасности отклонила перевод");

        }
    }

    public long getBalance(String accountNum) {
        return accounts.get(accountNum).getMoney();
    }
}
