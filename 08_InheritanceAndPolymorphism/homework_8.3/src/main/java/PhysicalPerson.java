public class PhysicalPerson extends Client {

  private double physicalPersonMoney;

  @Override
  public double getAmount() {
    System.out.println("Ваш остаток - " + physicalPersonMoney);
    return physicalPersonMoney;
  }

  @Override
  public void put(double amountToPut) {
    if (amountToPut < 0) {
      System.out.println("Сумма пополнения меньше нуля");
    } else {
      physicalPersonMoney = physicalPersonMoney + amountToPut;
      System.out.println("счет пополнен на " + amountToPut);
    }

  }

  @Override
  public void take(double amountToTake) {
    if (amountToTake < physicalPersonMoney) {
      physicalPersonMoney = physicalPersonMoney - amountToTake;
      System.out.println("Снято cо счета " + amountToTake);
    } else {
      System.out.println("Сумма " + amountToTake + " превышает остаток на счете");
    }

  }
}
