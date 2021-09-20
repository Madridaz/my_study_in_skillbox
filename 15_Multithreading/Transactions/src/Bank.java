import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();
    private final Random random = new Random();

    public Bank() {
        createAccounts();
    }

    //создание клиентской базы у объекта Bank
    private Map<String, Account> createAccounts() {
        for (int i = 0; i < 100; i++) {
            String id = String.valueOf(Math.abs(random.nextInt()));
            long money = Math.abs(random.nextLong()/1000000000);
            accounts.put(id, new Account(money/10000, id));
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
    public void transfer(String fromAccountNum, String toAccountNum, long amount) {

    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum) {
        return accounts.get(accountNum).getMoney();
    }

    public long getSumAllAccounts() {

        return 0;
    }
}
