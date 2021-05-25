public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 1000 рублей, Петя - 100 рубля, а Маша - 10 рублей";
    //String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль

    System.out.println(text.length());
    String sum1, sum2, sum3;

    sum1 = text.substring(text.indexOf("л"), text.indexOf("р"));
    sum1.trim();
    sum2 = text.substring(text.indexOf(" "), text.indexOf("р"));
    sum2.trim();
    sum3 = text.substring(text.indexOf(" "), text.indexOf("р"));
    sum3.trim();

    int result = Integer.parseInt(sum1) + Integer.parseInt(sum2) + Integer.parseInt(sum3);

    System.out.println("Вася заработал: " + sum1 + "\n" +
        "Петя заработал: " + sum2 + "\n" +
        "Маша заработала: " + sum3 + "\n" +
        "Общий заработок: " + result);
  }
}


