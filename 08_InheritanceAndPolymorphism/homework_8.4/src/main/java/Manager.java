public class Manager implements Employee {

  private String name;
  private static final int SALARY = 20_000;
  private int finalSalary = getMonthSalary();

  public Manager(String name) {
    this.name = name;

  }

  @Override
  public String toString() {
    return "менеджер " + this.name + ", зарплата - " + getMonthSalary();
  }

  //генерация зарплаты менеджера
  @Override
  public int getMonthSalary() {
    int earnedMin = 115_000;
    int earnedMax = 140_000;

    int moneyEarnedForTheCompany = (int) ((Math.random() * (earnedMax - earnedMin)) + earnedMin);
    return SALARY + (int) (moneyEarnedForTheCompany * 0.05);

  }
}
