public class Operator implements Employee {

  private String name;
  private static final int SALARY = 10_000;
  private int finalSalary = getMonthSalary();

  public Operator(String name) {
    this.name = name;

  }

  @Override
  public String toString() {
    return "оператор " + this.name + ", зарплата - " + getMonthSalary();
  }

  //генерация зарплаты оператора
  @Override
  public int getMonthSalary() {
    return SALARY;
  }
}
