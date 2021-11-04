import java.util.Set;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class Acquaintance {

  Jedis jedis = new Jedis("localhost");

  //создание пользователей и добавление их в БД
  public void addUsers() {
    for (int i = 1; i <= 20; i++) {
      jedis.zadd("users", i, "пользователь " + i);
    }
  }

  //вывод в консоль
  public void printUsers() throws InterruptedException {
    Set<Tuple> elements = jedis.zrangeWithScores("users", 1, -1);
    for (Tuple tuple : elements) {
      System.out.println(tuple.getElement());
      if ((int) tuple.getScore() == randomUser(20)) {
        System.out.println(tuple.getElement() + " оплатил услугу");
        break;
      }
      Thread.sleep(300);
    }
  }

  //генерация случайного юзера
  public int randomUser(int max) {
    return (int) (Math.random() * ++max);
  }


}


