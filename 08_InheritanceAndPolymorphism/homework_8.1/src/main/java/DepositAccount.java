import java.time.LocalDate;

public class DepositAccount extends BankAccount {

  private double depositAccountBill;
  private LocalDate lastPutTime;

  @Override
  public double getAmount() {
    System.out.println("Остаток на счете DepositAccount " + depositAccountBill);
    return depositAccountBill;
  }

  @Override
  public void put(double amountToPut) {
    LocalDate put = LocalDate.now();
    lastPutTime = put;

    if (amountToPut <= 0) {
      System.out.println("Сумма пополнения меньше или равна нулю");
    } else {
      depositAccountBill = depositAccountBill + amountToPut;
      System.out.println("счет DepositAccount пополнен на " + amountToPut);
    }
  }

  @Override
  public void take(double amountToTake) {
    LocalDate timeOfTake = LocalDate.now();

    if (lastPutTime.getMonthValue() < timeOfTake.getMonthValue()) {
      if (amountToTake < depositAccountBill) {
        depositAccountBill = depositAccountBill - amountToTake;
        System.out.println("Снято c DepositAccount " + amountToTake);
      } else {
        System.out.println("Сумма превышает остаток на счете");
      }
    } else {
      System.out.println(
          "Месяц с помента последнего пополнения не прошел, снятие невозможно");
    }


  }
}
