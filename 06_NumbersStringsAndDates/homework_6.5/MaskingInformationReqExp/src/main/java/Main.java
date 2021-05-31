import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


  public static void main(String[] args) {
    searchAndReplaceDiamonds("Номер кредитной карты <4008 1234> 56<4545>78 <5632 8912>", "****");


  }

  public static String searchAndReplaceDiamonds(String text, String placeholder) {
    // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений

    Pattern pattern = Pattern.compile("<.+?>");
    Matcher matcher = pattern.matcher(text);
    if (matcher.find()) {
      String secret = text.replaceAll("<.+?>", placeholder);
      System.out.println(secret);
    }
    return text;
  }
}

