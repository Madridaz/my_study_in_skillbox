public class LegalPerson extends Client {

  private double legalPersonMoney;

  @Override
  public double getAmount() {
    System.out.println("Ваш остаток - " + legalPersonMoney);
    return legalPersonMoney;
  }

  @Override
  public void put(double amountToPut) {
    if (amountToPut < 0) {
      System.out.println("Сумма пополнения меньше нуля");
    } else {
      legalPersonMoney = legalPersonMoney + amountToPut;
      System.out.println("счет пополнен на " + amountToPut);
    }

  }

  @Override
  public void take(double amountToTake) {
    double commission = amountToTake * 0.01;
    if (amountToTake < legalPersonMoney) {
      legalPersonMoney = legalPersonMoney - amountToTake - commission;
      System.out
          .println("Снято cо счета " + amountToTake + ", комиссия составила " + commission);
    } else {
      System.out.println("Сумма " + amountToTake + " превышает остаток на счете");
    }
  }

}
