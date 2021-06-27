public class Main {

  public static void main(String[] args) {
    Company apple = new Company();
    Company google = new Company();

    apple.hire(EmployeeFactory.getOne("operator"));
    apple.showAllEmployees(apple);
    System.out.println();

    apple.hireAll(EmployeeFactory.getOne("operator"), 3);
    apple.hireAll(EmployeeFactory.getOne("manager"), 3);
    apple.hireAll(EmployeeFactory.getOne("topmanager"), 3);
    apple.showAllEmployees(apple);
    System.out.println();

    apple.fire(1);
    System.out.println();
    apple.showAllEmployees(apple);

    System.out.println();

    google.hire(EmployeeFactory.getOne("manager"));
    google.showAllEmployees(google);
    System.out.println();

    google.hireAll(EmployeeFactory.getOne("operator"), 5);
    google.hireAll(EmployeeFactory.getOne("manager"), 5);
    google.hireAll(EmployeeFactory.getOne("topmanager"), 5);
    google.showAllEmployees(google);
    System.out.println();

    google.fire(7);
    System.out.println();
    google.showAllEmployees(google);

  }
}
