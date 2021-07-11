import java.util.List;

public class Main {

  public static final String STAFF_TXT = "data/staff.txt";

  public static void main(String[] args) {
    List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
    System.out.println("начальный список");
    System.out.println(staff);
    System.out.println("список, отсортированный по зарплате и алфавиту");
    sortBySalaryAndAlphabet(staff);
  }

  public static void sortBySalaryAndAlphabet(List<Employee> staff) {

    staff.sort((o1, o2) -> {
      if (o1.getSalary().compareTo(o2.getSalary()) == 0) {
        return o1.getName().compareTo(o2.getName());
      } else {
        return o1.getSalary().compareTo(o2.getSalary());
      }
    });
    System.out.println(staff);

  }


}
