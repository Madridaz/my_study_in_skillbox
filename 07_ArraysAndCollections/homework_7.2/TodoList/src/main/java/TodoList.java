import java.util.ArrayList;

public class TodoList {

  ArrayList todoList = new ArrayList();

  public void add(String todo) {
    // TODO: добавьте переданное дело в конец списка
    todoList.add(todo);
  }

  public void add(int index, String todo) {
    // TODO: добавьте дело на указаный индекс,
    //  проверьте возможность добавления
    todoList.add(index, todo);
  }

  public void edit(String todo, int index) {
    // TODO: заменить дело на index переданным todo индекс,
    //  проверьте возможность изменения
  }

  public void delete(int index) {
    // TODO: удалить дело находящееся по переданному индексу,
    //  проверьте возможность удаления дела
  }

  public ArrayList<String> getTodos() {
    // TODO: вернуть список дел
    for (int i = 0; i < todoList.size(); i++) {
      System.out.println(todoList.get(i));
    }

    return new ArrayList<>();
  }
}