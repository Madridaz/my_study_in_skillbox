public class CardAccount extends BankAccount {

  private double cardAccountBill;

  @Override
  protected double getAmount() {
    System.out.println("Остаток на счете CardAccount " + cardAccountBill);
    return cardAccountBill;
  }

  @Override
  protected void put(double amountToPut) {
    if (amountToPut <= 0) {
      System.out.println("Сумма пополнения меньше или равна нулю");
    } else {
      cardAccountBill = cardAccountBill + amountToPut;
      System.out.println("счет CardAccount пополнен на " + amountToPut);
    }
  }

  @Override
  protected void take(double amountToTake) {
    double commission = amountToTake * 0.01;
    if (amountToTake < cardAccountBill) {
      cardAccountBill = cardAccountBill - amountToTake - commission;
      System.out.println("Снято c CardAccount " + amountToTake);
    } else {
      System.out.println("Сумма превышает остаток на счете");
    }
  }
}
