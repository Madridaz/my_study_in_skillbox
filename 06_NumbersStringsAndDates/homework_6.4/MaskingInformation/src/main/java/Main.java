import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    searchAndReplaceDiamonds("Номер кредитной карты <4008 1234 5678> 8912>", "****");
  }

  public static String searchAndReplaceDiamonds(String text, String placeholder) {
    // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений

    if (text.indexOf("<") != -1) {
      int begin = text.indexOf("<");
      int end = text.indexOf(">");
      String secret = text.substring(begin + 1, end);
      String safe = text.replaceAll(secret, placeholder);
      System.out.println(safe);
    } else {
      System.out.println(text);

    }
    return text;
  }
}
