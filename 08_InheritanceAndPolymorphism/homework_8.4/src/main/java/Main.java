public class Main {

  public static void main(String[] args) {
    Company company = new Company();
    Manager manager = new Manager();
    Operator operator = new Operator();
    TopManager topManager = new TopManager();

    System.out.println("Доход компании " + company.getIncome());
    System.out.println("Зарплата менеджера " + manager.getMonthSalary());
    System.out.println("Зарплата оператора " + operator.getMonthSalary());
    System.out.println("Зарплата топ-менеджера " + topManager.getMonthSalary());




  }

}
