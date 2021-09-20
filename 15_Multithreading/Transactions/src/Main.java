public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        System.out.println(bank.getAccounts().values());

        bank.getSumAllAccounts();

    }
}
