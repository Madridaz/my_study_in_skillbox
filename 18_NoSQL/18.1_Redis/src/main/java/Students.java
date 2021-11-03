import redis.clients.jedis.Jedis;

public class Students {

  public void courses() {
    Jedis student = new Jedis("localhost");
    System.out.println("Задача 18.1.2");
    student.hset("Иванов И. И.", "Web-developer", "1");
    student.hset("Иванов И. И.", "Data Science", "4");
    System.out.println("Все значения: " + student.hgetAll("Иванов И. И."));
    student.hincrBy("Иванов И. И.", "Data Science", Long.parseLong("1"));
    System.out.println("Все значения: " + student.hgetAll("Иванов И. И."));
    System.out.println("Очистка БД: " + student.flushAll());
    System.out.println(student.keys("*"));
  }

}
