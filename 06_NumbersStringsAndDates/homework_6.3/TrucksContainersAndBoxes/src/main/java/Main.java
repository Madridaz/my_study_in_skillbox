import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Введите количество коробок");
    Scanner scanner = new Scanner(System.in);
    String boxes = scanner.nextLine();

    try {
      int numberOfBoxes = Integer.valueOf(boxes);

    } catch (NumberFormatException e) {
      System.err.println("Неправильный формат строки!");
    }


    // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
    // пример вывода при вводе 2
    // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
  }

}
