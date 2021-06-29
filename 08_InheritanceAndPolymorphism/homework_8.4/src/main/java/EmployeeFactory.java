public class EmployeeFactory {

    //метод для создания одного сотрудника на выбор
  Company company = new Company();
  public static Employee getOne(String position, Company company) {
    if ("topmanager".equalsIgnoreCase(position)) {
      return new TopManager("Вася", company);

    } else if ("manager".equalsIgnoreCase(position)) {
      return new Manager("Петя", company);

    } else {
      return new Operator("Леша", company);
    }
  }
}
