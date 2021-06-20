import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  private static void checkInput(PhoneBook phoneBook) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Введите номер, имя или команду:");
      String input = scanner.nextLine();
      if ("EXIT".equals(input)) {
        break;
      }
      if ("LIST".equals(input)) {
        if (phoneBook.getAllContacts().isEmpty()) {
          System.out.println("книга пуста");
        } else {
          System.out.println(phoneBook.getAllContacts());
        }
      }
      if (phoneBook.isName(input)) {
        if (!phoneBook.getPhonesByName(input).isEmpty()) {
          phoneBook.printOneContact(phoneBook.getPhonesByName(input), input);

        } else {
          System.out.println("Введи номер");
          String number = scanner.nextLine();
          phoneBook.addContact(number, input);
        }
      }
      if (phoneBook.isPhone(input)) {
        if (!phoneBook.getNameByPhone(input).isEmpty()) {
          System.out.println(phoneBook.getNameByPhone(input));

        } else {
          System.out.println("Введи имя");
          String name = scanner.nextLine();
          phoneBook.addContact(input, name);
        }
      }

    }
  }

  public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();

    checkInput(phoneBook);
  }
}
