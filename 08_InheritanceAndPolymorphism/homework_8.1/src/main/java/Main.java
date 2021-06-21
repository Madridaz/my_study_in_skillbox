public class Main {

  public static void main(String[] args) throws InterruptedException {
    BankAccount bankAccount = new BankAccount();
    CardAccount cardAccount = new CardAccount();
    DepositAccount depositAccount = new DepositAccount();

    System.out.println("Демонстрация работы с классом BankAccount");
    bankAccount.getAmount();
    bankAccount.put(100);
    bankAccount.getAmount();
    bankAccount.take(50);
    bankAccount.take(100);
    bankAccount.getAmount();
    Thread.sleep(1000);
    System.out.println();

    System.out.println("Демонстрация работы с классом CardAccount");
    cardAccount.getAmount();
    cardAccount.put(100);
    cardAccount.getAmount();
    cardAccount.take(50);
    cardAccount.getAmount();
    cardAccount.take(50);
    Thread.sleep(1000);
    System.out.println();

    System.out.println("Демонстрация работы с классом DepositAccount");
    depositAccount.getAmount();
    depositAccount.put(100);
    depositAccount.getAmount();
    depositAccount.take(50);
    Thread.sleep(1000);
    System.out.println();

    System.out.println("Демонстрация задачи со *");
    bankAccount.getAmount();
    bankAccount.put(500);
    bankAccount.send(cardAccount, 200);
    bankAccount.getAmount();
    cardAccount.getAmount();
    cardAccount.send(bankAccount, 100);
    bankAccount.getAmount();
    cardAccount.getAmount();
  }

}
