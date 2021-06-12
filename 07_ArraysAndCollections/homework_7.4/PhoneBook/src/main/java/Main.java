import java.util.Scanner;

public class Main {

  private static void checkInput(PhoneBook phoneBook) {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();

      if (input.matches("[A-ZА-ЯЁ]{1}[a-zа-яё]+")) { // введено имя
        phoneBook.getPhonesByName(input);

      } else if (input.matches(
          "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")) { // введен телефон
        phoneBook.getNameByPhone(input);

      } else if (input.contains("LIST")) {
        phoneBook.getAllContacts();
      } else {
        System.out.println("Ошибка ввода, повторите");
      }
    }
  }

  public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();
    System.out.println("Введите номер, имя или команду:");
    checkInput(phoneBook);
  }
}
