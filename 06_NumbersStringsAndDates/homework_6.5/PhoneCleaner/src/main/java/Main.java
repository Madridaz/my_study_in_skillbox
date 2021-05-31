import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Введите номер телефона");
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      if (input.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")) {

        String output = input.replaceAll("[^0-9]", "");
        System.out.println(output);

      } else {
        System.out.println("Неверный формат номера");
      }
    }
  }

}
