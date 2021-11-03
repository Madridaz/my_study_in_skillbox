import redis.clients.jedis.Jedis;

public class Travel {

  public void goTravel() {
    Jedis travel = new Jedis("localhost");
    System.out.println("Задача 18.2.1");

    travel.zadd("fly", Double.parseDouble("78"), "Moscow");
    travel.zadd("fly", Double.parseDouble("716"), "New York");
    travel.zadd("fly", Double.parseDouble("402"), "Madrid");
    travel.zadd("fly", Double.parseDouble("335"), "London");
    travel.zadd("fly", Double.parseDouble("802"), "Edinburgh");
    travel.zadd("fly", Double.parseDouble("1278"), "Tokyo");
    travel.zadd("fly", Double.parseDouble("550"), "Kadir");
    travel.zadd("fly", Double.parseDouble("680"), "Birmingham");
    travel.zadd("fly", Double.parseDouble("907"), "Oslo");
    travel.zadd("fly", Double.parseDouble("397"), "Barcelona");

    System.out.println(
        "Все элементы в коллекции fly, отсортированные по возрастанию цены перелета: "
            + travel.zrange("fly", 0, -1));

    System.out.println("Топ 3 самых дешевых перелетов: " + travel.zrange("fly", 0, 2));

    System.out.println(
        "Все элементы в коллекции fly, отсортированные по убыванию цены перелета: "
            + travel.zrevrange("fly", 0, -1));

    System.out.println("Топ 3 самых дорогих перелетов: " + travel.zrevrange("fly", 0, 2));
  }


}
