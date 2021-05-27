public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    String sum1, sum2, sum3;

    sum1 = text.substring(text.indexOf("л") + 2, text.indexOf("у") - 2);
    sum2 = text.substring(text.indexOf("-") + 2, text.indexOf("М") - 10);
    sum3 = text.substring(text.indexOf("ш") + 5, text.length() - 7);
    sum1.trim();
    sum2.trim();
    sum3.trim();

    int result = Integer.parseInt(sum1) + Integer.parseInt(sum2) + Integer.parseInt(sum3);
    System.out.println(result);
  }
}

