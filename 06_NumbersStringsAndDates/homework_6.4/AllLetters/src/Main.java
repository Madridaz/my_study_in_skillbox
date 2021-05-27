public class Main {

  public static void main(String[] args) throws InterruptedException {
    for (char i = 'A'; i <= 'Z'; i++) {
      int c = i;
      System.out.println(i + ":" + " " + c);
      Thread.sleep(300);
    }

    System.out.println();

    for (char j = 'a'; j <= 'z'; j++) {
      int b = j;
      System.out.println(j + ":" + " "  + b);
      Thread.sleep(300);
    }

    System.out.println();

    for (char j = 'А'; j <= 'Я'; j++) {
      int b = j;
      System.out.println(j + ":" + " "  + b);
      Thread.sleep(300);
    }

    System.out.println();

    for (char j = 'а'; j <= 'я'; j++) {
      int b = j;
      System.out.println(j + ":" + " "  + b);
      Thread.sleep(300);
    }
    System.out.println();

    for (char j = '0'; j <= '9'; j++) {
      int b = j;
      System.out.println(j + ":" + " "  + b);
      Thread.sleep(300);
    }
  }
}