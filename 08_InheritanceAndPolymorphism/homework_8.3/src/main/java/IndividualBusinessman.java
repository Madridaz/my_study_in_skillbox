public class IndividualBusinessman extends Client {

  private double individualBusinessmanMoney;

  @Override
  public double getAmount() {
    System.out.println("Ваш остаток - " + individualBusinessmanMoney);
    return individualBusinessmanMoney;
  }

  @Override
  public void put(double amountToPut) {
    double commissionOnePercent = amountToPut * 0.01;
    double commissionHalfOnePercent = amountToPut * 0.005;
    if (amountToPut < 0) {
      System.out.println("Сумма пополнения меньше нуля");
    } else if (amountToPut < 1000) {
      individualBusinessmanMoney = individualBusinessmanMoney + amountToPut - commissionOnePercent;
      System.out.println(
          "счет пополнен на " + amountToPut + ", комиссия составила " + commissionOnePercent);
    } else if (amountToPut >= 1000) {
      individualBusinessmanMoney =
          individualBusinessmanMoney + amountToPut - commissionHalfOnePercent;
      System.out.println(
          "счет пополнен на " + amountToPut + ", комиссия составила " + commissionHalfOnePercent);
    }

  }

  @Override
  public void take(double amountToTake) {
    double commission = amountToTake * 0.01;
    if (amountToTake < individualBusinessmanMoney) {
      individualBusinessmanMoney = individualBusinessmanMoney - amountToTake - commission;
      System.out
          .println("Снято cо счета " + amountToTake + ", комиссия составила " + commission);
    } else {
      System.out.println("Сумма " + amountToTake + " превышает остаток на счете");
    }
  }
}
