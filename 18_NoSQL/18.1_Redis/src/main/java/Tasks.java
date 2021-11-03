public class Tasks {

  public static void main(String[] args) throws InterruptedException {
    ToDo toDo = new ToDo();
    toDo.ToDoList();
    Thread.sleep(2000);
    Students students = new Students();
    students.courses();

  }
}