import java.util.Scanner;

public class Main {

  private static TodoList todoList = new TodoList();

  public static void main(String[] args) {
    // TODO: написать консольное приложение для работы со списком дел todoList
    System.out.println("Enter command: ");
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String name = scanner.nextLine();

      if (name.contains("LIST")) {
        todoList.getTodos();
      }
      //lovit tolko ADD obrezaet i zanosit delo v konec spiska
      if (name.matches("(ADD)\\s\\D+")) {
        System.out.println("tolko ADD");
        String data = name.replace("ADD ", "");
        todoList.add(data);
      }
      //dolzen lovit ADD i index i delo, proverit index!>=todolist.size i zanesti v spisok po indeksu
      else if (name.matches("[(A-Z)]?(\\s)(\\d)(\\s)(.+)")) {
        System.out.println("ADD i index");

        String data = name.replaceAll("[(A-Z)]?(\\s)(\\d)(\\s)", "");
        String indexCut = name.replaceAll("[(A-Z)]?(\\s)(\\s)(.+)", "");
       // int index = Integer.parseInt(indexCut);
        System.out.println(indexCut);
        System.out.println(data);
        todoList.add(index, data);
      //}

//      else {
//        System.out.println("net");
//      }
    }
  }
}