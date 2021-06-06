import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void isOnlyAdd(String name) {
    if (name.matches("(ADD)\\s\\D+")) {
      System.out.println("Добавлено в конец списка");
      String data = name.replace("ADD ", "");
      todoList.add(data);
    }
  }

  public static void addAndIndex(String name) {
    if (name.matches("ADD\\s(\\d+)\\s(.+)")) {
      System.out.println("Режим добавления по индексу");
      String[] data = name.split(" ");
      String index = data[1];
      if (index.matches("\\d+")) {
        int indexCut = Integer.parseInt(index);
        try {
          todoList.add(indexCut, data[2]);
        } catch (IndexOutOfBoundsException exception) {
          System.out.println("Введен несуществующий индекс, добавление будет в конец списка");
          todoList.add(data[2]);
        }
      }
    }
  }

  public static void editByIndex(String name) {
    if (name.matches("EDIT\\s(\\d+)\\s(.+)")) {
      System.out.println("Режим замены по индексу");
      String[] data = name.split(" ");
      String index = data[1];
      if (index.matches("\\d+")) {
        int indexCut = Integer.parseInt(index);
        try {
          todoList.edit(data[2], indexCut);
        } catch (IndexOutOfBoundsException exception) {
          System.out.println("Введен несуществующий индекс, замены не будет");
        }
      }
    }
  }

  public static void deleteByIndex(String name) {
    if (name.matches("DELETE\\s(\\d+)")) {
      System.out.println("Режим удаления по индексу");
      String[] data = name.split(" ");
      String index = data[1];
      if (index.matches("\\d+")) {
        int indexCut = Integer.parseInt(index);
        try {
          todoList.delete(indexCut);
        } catch (IndexOutOfBoundsException exception) {
          System.out.println("Введен несуществующий индекс, удаления не будет");
        }
      }
    }
  }

  private static TodoList todoList = new TodoList();

  public static void main(String[] args) {
    // TODO: написать консольное приложение для работы со списком дел todoList
    System.out.println("Enter command: ");
    System.out.println();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String name = scanner.nextLine();
      String[] data = name.split(" ");
      switch (data[0]) {
        case "ADD":
          isOnlyAdd(name);
          addAndIndex(name);
          break;
        case "LIST":
          todoList.getTodos();
          break;
        case "EDIT":
          editByIndex(name);
          break;
        case "DELETE":
          deleteByIndex(name);
      }
    }
  }
}
