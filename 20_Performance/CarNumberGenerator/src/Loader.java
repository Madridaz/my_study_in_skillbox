import java.io.PrintWriter;

public class Loader {

  public static void main(String[] args) throws Exception {
    long start = System.currentTimeMillis();

    PrintWriter writer = new PrintWriter("res/numbers.txt");

    char letters[] = {'У', 'К', 'Е', 'Н', 'Х', 'В', 'А', 'Р', 'О', 'С', 'М', 'Т'};
    StringBuilder builder = new StringBuilder();
    for (int regionCode = 1; regionCode < 100; regionCode++) {

      for (int number = 1; number < 100; number++) {
        for (char firstLetter : letters) {
          for (char secondLetter : letters) {
            for (char thirdLetter : letters) {
              builder.append(firstLetter);
              builder.append(padNumber(number, 3));
              builder.append(secondLetter);
              builder.append(thirdLetter);
              builder.append(padNumber(regionCode, 2));
              builder.append("\n");
            }
          }
        }
      }
      writer.write(builder.toString());
      builder.setLength(0);
    }
    writer.flush();
    writer.close();

    System.out.println((System.currentTimeMillis() - start) + " ms");
  }

  private static String padNumber(int number, int numberLength) {
    String numberStr = number + "";
    int padSize = numberLength - numberStr.length();
    if (padSize == 2) {
      return "0" + numberStr;
    }
    if (padSize == 1) {
      return "00" + numberStr;
    }

    return numberStr;
  }
}
