import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  private static TodoList todoList = new TodoList();

  public static void main(String[] args) {
    // TODO: написать консольное приложение для работы со списком дел todoList
    System.out.println("Enter command: ");
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String name = scanner.nextLine();

      if (name.matches("(ADD)\\s\\D+")) {
        System.out.println("Добавлено в конец списка");
        String data = name.replace("ADD ", "");
        todoList.add(data);
      } else if (name.matches("ADD\\s(\\d+)\\s(.+)")) {
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
      } else if (name.matches("EDIT\\s(\\d+)\\s(.+)")) {
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
      } else if (name.matches("DELETE\\s(\\d+)")) {
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
      if (name.contains("LIST")) {
        todoList.getTodos();
      }
    }
  }
}