import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

  List<Employee> employees = new ArrayList();

  Company company;
  //метод получения дохода компании
  public static long getIncome() {
    int minIncome = 5_000_000;
    int maxIncome = 10_000_000;

    return (long) ((Math.random() * (maxIncome - minIncome)) + minIncome);

  }

  //метод нанимает одного сотрудника указанного типа
  public void hire(Employee employee) {
    employees.add(employee);
  }

  //метод нанимает определенное число сотрудников указанного типа
  public void hireAll(String position, int count) {
    for (int i = 0; i < count; i++) {
      employees.add(EmployeeFactory.getOne(position, company));
    }
  }

  //метод увольняет одного сотрудника по номеру из списка showAllEmployees
  public void fire(int index) {
    employees.remove(index - 1);
  }

  //метод выводит список всех сотрудников переданной компании
  public void showAllEmployees(Company company) {
    for (int i = 0; i < employees.size(); i++) {
      System.out.println((i + 1) + ". " + employees.get(i));
    }
  }

  public List<Integer> getLowestSalaryStaff(int count) {
    List<Integer> salaries = new ArrayList<>();
    for (int i = 0; i < employees.size(); i++) {
      salaries.add(employees.get(i).getMonthSalary());
    }
    Collections.sort(salaries);
    System.out.println(salaries);
    return salaries;
  }

  public List<Integer> getTopSalaryStaff(int count) {
    List<Integer> salaries = new ArrayList<>();
    for (int i = 0; i < employees.size(); i++) {
      salaries.add(employees.get(i).getMonthSalary());
    }
    Collections.sort(salaries, Collections.reverseOrder());
    System.out.println(salaries);
    return salaries;
  }


}
