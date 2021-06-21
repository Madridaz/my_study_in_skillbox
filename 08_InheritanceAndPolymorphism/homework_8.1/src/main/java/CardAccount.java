public class CardAccount extends BankAccount {

  double cA;

  @Override
  public double getAmount() {
    System.out.println("Остаток на счете CardAccount " + cA);
    return cA;
  }

  @Override
  public void put(double amountToPut) {
    if (amountToPut <= 0) {
      System.out.println("Сумма пополнения меньше или равна нулю");
    } else {
      cA = cA + amountToPut;
      System.out.println("счет CardAccount пополнен на " + amountToPut);
    }
  }

  @Override
  public void take(double amountToTake) {
    double commission = amountToTake * 0.01;
    if (amountToTake < cA) {
      cA = cA - amountToTake - commission;
      System.out.println("Снято c CardAccount " + amountToTake);
    } else {
      System.out.println("Сумма превышает остаток на счете");
    }
  }
}
