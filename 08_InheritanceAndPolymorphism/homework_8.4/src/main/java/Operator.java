public class Operator implements Employee {

  private static final int OPERATORSALARY = 10_000;

  //генерация зарплаты оператора
  @Override
  public int getMonthSalary() {
    return OPERATORSALARY;
  }
}
