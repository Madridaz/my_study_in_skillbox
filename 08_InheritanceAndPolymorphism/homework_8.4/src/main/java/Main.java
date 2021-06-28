public class Main {

  public static void main(String[] args) {
    Company apple = new Company();

    apple.hireAll("operator", 180);
    apple.hireAll("manager", 80);
    apple.hireAll("topmanager", 10);
    apple.showAllEmployees(apple);
    apple.getTopSalaryStaff(15);
    apple.getLowestSalaryStaff(15);


  }
}
