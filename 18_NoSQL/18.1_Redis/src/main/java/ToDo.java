import redis.clients.jedis.Jedis;

public class ToDo {

  public void ToDoList() {
    Jedis toDo = new Jedis("localhost");
    System.out.println("Задача 18.1.1");

    toDo.sadd("ToDo", "Buy milk", "Fill the car", "Feed the cat");
    System.out.println("Список всех ключей: " + toDo.keys("*"));
    System.out.println("Значения ключа: " + toDo.smembers("ToDo"));
    toDo.sadd("ToDo", "Buy milk");
    System.out.println(
        "Значения ключа после повторного добавления дела: " + toDo.smembers("ToDo"));
    toDo.srem("ToDo", "Buy milk");
    System.out.println("Значения ключа после удаления 1 значения: " + toDo.smembers("ToDo"));
    toDo.srem("ToDo", "Fill the car");
    System.out.println("Значения ключа после удаления 2 значения: " + toDo.smembers("ToDo"));
    toDo.srem("ToDo", "Feed the cat");
    System.out.println("Значения ключа после удаления 3 значения: " + toDo.smembers("ToDo"));
    System.out.println("Очистка БД: " + toDo.flushAll());
    System.out.println(toDo.keys("*"));
    System.out.println("========================================================================");

  }

}
