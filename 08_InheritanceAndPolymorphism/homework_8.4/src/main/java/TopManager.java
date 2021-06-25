public class TopManager implements Employee {

  private static final int TOPMANAGERSALARY = 30_000;
  Company company = new Company();

  //генерация зарплаты топ-менеджера
  @Override
  public int getMonthSalary() {
    if (company.getIncome() > 10_000_000) {
      return TOPMANAGERSALARY + (int) (TOPMANAGERSALARY * 1.5);
    } else {
      return TOPMANAGERSALARY;
    }
  }
}
