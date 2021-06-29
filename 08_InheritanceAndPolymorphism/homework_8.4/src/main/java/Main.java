public class Main {

  public static void main(String[] args) {
    Company company = new Company();

    company.hireAll("operator", 5);
    company.hireAll("manager", 5);
    company.hireAll("topmanager", 5);
    company.showAllEmployees(company);
    company.getTopSalaryStaff(15);
    company.getLowestSalaryStaff(15);


  }
}
