import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Введите данные");

      String input = scanner.nextLine();
      boolean result =
          input.matches("[А-Я{1}][а-я/-?]+\\s{1}[А-Я{1}][а-я/-?]+\\s{1}[А-Я{1}][а-я/-?]+");
      if (result) {
        String[] data = input.split(" ");

        System.out.println("Фамилия " + data[0]);
        System.out.println("Имя " + data[1]);
        System.out.println("Отчество " + data[2] + "\n");

      } else {
        System.out.println("Введенная строка не является ФИО" + "\n");
      }
    }
  }
}