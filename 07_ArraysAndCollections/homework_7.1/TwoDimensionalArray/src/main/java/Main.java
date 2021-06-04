import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    char[][] array = TwoDimensionalArray.getTwoDimensionalArray(7);

    for (char[] arrayLine : array) {
      for (char arrayValue : arrayLine) {
        System.out.print(arrayValue);
      }
      System.out.println();
    }
  }
}