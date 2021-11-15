import java.util.Scanner;

public class Main {

  private static final String HEAD = "Для работы с программой введите любую из команд:" + "\n" +
      "добавление магазина - (Пример: добавить магазин Гиппо)" + "\n" +
      "добавление товара - (Пример: добавить пиво 100)" + "\n" +
      "добавление товара в магазин - (Пример: выставить товар пиво Гиппо)" + "\n" +
      "вывод статистики по магазинам - (Пример: статистика товаров)" + "\n";

  private static final String ADDMARKET = "(добавить магазин)\\s([А-Яа-я0-9]+)";
  private static final String ADDPRODUCT = "(добавить)\\s([А-Яа-я0-9]+)\\s([0-9]+)";
  private static final String ADDPRODUCTTOMARKET = "(выставить товар)\\s([А-Яа-я0-9]+)\\s([А-Яа-я0-9]+)";
  private static final String STATS = "(статистика товаров)";


  public static void main(String[] args) {

    WorkSession workSession = new WorkSession();

    System.out.println(HEAD);

    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите действие");
      String answer = scanner.nextLine();
      String[] array = answer.split(" ");

      //Проверка ввода
      if (answer.matches(ADDMARKET)) {
        System.out.println("Вы добавляете новый магазин: " + array[2]);
        workSession.addMarket(array[2]);
      } else if (answer.matches(ADDPRODUCT)) {
        System.out.println("Вы добавляете новый товар: " + array[1]);
        workSession.addProduct(array[1], Integer.parseInt(array[2]));
      } else if (answer.matches(ADDPRODUCTTOMARKET)) {
        System.out.println("Вы выставляете товар: " + array[2] + " в магазин: " + array[3]);
        workSession.addProductToMarket(array[2], array[3]);
      } else if (answer.matches(STATS)) {
        System.out.println("Статистика по всем магазинам");
        workSession.stats();
      } else {
        System.out.println("Неправильный ввод, повторите");
        System.out.println(HEAD);
      }
    }


  }
}



