public class TopManager implements Employee {

  private String name;
  private static final int SALARY = 30_000;
  private int finalSalary = getMonthSalary();
  Company company;

  public TopManager(String name, Company company) {
    this.name = name;
    this.company = company;

  }

  @Override
  public String toString() {
    return "топменеджер " + this.name + ", зарплата - " + getMonthSalary();
  }

  //генерация зарплаты топ-менеджера
  @Override
  public int getMonthSalary() {
    if (Company.getIncome() > 10_000_000) {
      return SALARY + (int) (SALARY * 1.5);
    } else {
      return SALARY;
    }

  }
}
