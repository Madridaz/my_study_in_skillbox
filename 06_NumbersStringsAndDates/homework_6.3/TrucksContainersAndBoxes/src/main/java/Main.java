import java.util.Scanner;


public class Main {
  static int containerCount = 0;
  static int truckCount = 0;
  static int boxCount = 0;

  public static void main(String args[]) {
    while (true) {
      System.out.println("Введите количество ящиков:");
      Scanner scanner = new Scanner(System.in);
      String boxes = scanner.nextLine();

      int boxesValue = Integer.parseInt(boxes);

      for (int i = 0; i < boxesValue; i++) {
        addBox();
      }

      if (boxesValue == 0) {
        System.out.println("У Вас нет ящиков для перевозки");
      }

      System.out.println("Необходимо:");
      System.out.println("грузовиков - " + truckCount + " шт.");
      System.out.println("контейнеров - " + containerCount + " шт.");

      clear();

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

  public static void addBox() {
    ++boxCount;
    if (boxCount % 27 - 1 == 0) addContainer();
    System.out.println("\t\tЯщик: " + boxCount);
  }

  public static void addContainer() {
    ++containerCount;
    if (containerCount % 12 - 1 == 0) addTruck();
    System.out.println("\tКонтейнер: " + containerCount);
  }

  public static void addTruck() {
    ++truckCount;
    System.out.println("Грузовик: " + truckCount);
  }

  public static void clear() {
    containerCount = 0;
    truckCount = 0;
    boxCount = 0;
  }
}