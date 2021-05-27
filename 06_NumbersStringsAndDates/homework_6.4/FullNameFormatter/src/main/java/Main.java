import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0") || input.equals(" ")) {
        System.out.println("Введенная строка не является ФИО");
        break;
      }
      // TODO:напишите ваш код тут, результат вывести в консоль.
      // При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

      String surname = input.substring(0, input.indexOf(" "));
      String name = input.substring(surname.length() + 1, input.lastIndexOf(" "));
      String patronymic = input.substring((surname.length() + name.length() + 2), input.length());

      if (surname.equals(" ") || name.equals(" ") || patronymic.equals(" ")) {
        System.out.println("Введенная строка не является ФИО");
      } else if (surname.isEmpty() || name.isEmpty() || patronymic.isEmpty()) {
        System.out.println("Введенная строка не является ФИО");
      } else {
        System.out.println(
            "Фамилия: " + surname + "\n" + "Имя: " + name + "\n" + "Отчество: " + patronymic);
      }
    }
  }
}