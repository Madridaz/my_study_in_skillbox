public class EmployeeFactory {

  //метод для создания одного сотрудника на выбор
  public static Employee getOne(String position) {
    if ("topmanager".equalsIgnoreCase(position)) {
      return new TopManager("Вася");

    } else if ("manager".equalsIgnoreCase(position)) {
      return new Manager("Петя");

    } else {
      return new Operator("Леша");
    }
  }
}
