import java.util.Arrays;

public class TwoDimensionalArray {

  public static char[][] getTwoDimensionalArray(int size) {
    char[][] array = new char[size][size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i == j || (i + j + 1 == size)) {
          array[i][j] = 'X';
        } else {
          array[i][j] = ' ';
        }
      }
    }
    return array;
  }
}