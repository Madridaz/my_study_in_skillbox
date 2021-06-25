public class Manager implements Employee {

  private static final int MANAGERSALARY = 20_000;

  //генерация зарплаты менеджера
  @Override
  public int getMonthSalary() {
    int earnedMin = 115_000;
    int earnedMax = 140_000;

    int moneyEarnedForTheCompany = (int) ((Math.random() * (earnedMax - earnedMin)) + earnedMin);
    int finalSalary = MANAGERSALARY + (int) (moneyEarnedForTheCompany * 0.05);
    return finalSalary;
  }
}
