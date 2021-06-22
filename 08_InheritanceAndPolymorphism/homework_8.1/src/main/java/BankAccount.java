public class BankAccount {

  private double bankAccountBill;

  public double getAmount() {
    System.out.println("Остаток на счете BankAccount " + bankAccountBill);
    return bankAccountBill;
  }

  public void put(double amountToPut) {
    if (amountToPut <= 0) {
      System.out.println("Сумма пополнения меньше или равна нулю");
    } else {
      bankAccountBill = bankAccountBill + amountToPut;
      System.out.println("счет BankAccount пополнен на " + amountToPut);
    }
  }

  public void take(double amountToTake) {
    if (amountToTake < bankAccountBill) {
      bankAccountBill = bankAccountBill - amountToTake;
      System.out.println("Снято c BankAccount " + amountToTake);
    } else {
      System.out.println("Сумма превышает остаток на счете");
    }
  }

  public boolean send(BankAccount receiver, double amount) {
    this.take(amount);
    receiver.put(amount);

    return true;

  }
}
