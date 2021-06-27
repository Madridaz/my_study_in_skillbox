import java.util.ArrayList;
import java.util.List;

public class Company {

  List<Employee> employees = new ArrayList();
  private static long income = 200_000_000;

  //метод получения дохода компании
  public static long getIncome() {
    return income;
  }

  //метод нанимает одного сотрудника указанного типа
  public void hire(Employee employee) {
    employees.add(employee);
  }

  //метод нанимает указанное число сотрудников указанного типа
  public void hireAll(Employee employee, int count) {
    for (int i = 0; i < count; i++) {
      employees.add(employee);
    }
  }

  //метод увольняет одного сотрудника по номеру из списка showAllEmployees
  public void fire(int index) {
    employees.remove(index - 1);
  }

  //метод выводит список всех сотрудников переданной компании
  public void showAllEmployees(Company company) {
    for (int i = 0, j = 1; i < employees.size(); i++, j++) {
      System.out.print(j + ". ");
      System.out.println(employees.get(i));
    }
  }

}
