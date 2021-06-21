public class BankAccount {

  double bA;

  public double getAmount() {
    System.out.println("Остаток на счете BankAccount " + bA);
    return bA;
  }

  public void put(double amountToPut) {
    if (amountToPut <= 0) {
      System.out.println("Сумма пополнения меньше или равна нулю");
    } else {
      bA = bA + amountToPut;
      System.out.println("счет BankAccount пополнен на " + amountToPut);
    }
  }

  public void take(double amountToTake) {
    if (amountToTake < bA) {
      bA = bA - amountToTake;
      System.out.println("Снято c BankAccount " + amountToTake);
    } else {
      System.out.println("Сумма превышает остаток на счете");
    }
  }

  boolean send(BankAccount receiver, double amount) {
    this.take(amount);
    receiver.put(amount);

    return true;

  }
}
