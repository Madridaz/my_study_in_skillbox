import redis.clients.jedis.Jedis;

public class Tasks {

  public static void main(String[] args) {

    Jedis jedis = new Jedis("localhost");
    System.out.println("Подключиться успешно");
    // Проверяем, запущен ли сервис
    System.out.println("Служба работает: " + jedis.ping());
  }
}