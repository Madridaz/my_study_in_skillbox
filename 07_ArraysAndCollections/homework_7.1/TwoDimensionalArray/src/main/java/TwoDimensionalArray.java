public class TwoDimensionalArray {

  public static char symbol = 'X';

  public static char[][] getTwoDimensionalArray(int size) {

    char[][] array = {
        {'X', ' ', ' ', ' ', ' ', ' ', 'X'},
        {' ', 'X', ' ', ' ', ' ', 'X', ' '},
        {' ', ' ', 'X', ' ', 'X', ' ', ' '},
        {' ', ' ', ' ', 'X', ' ', ' ', ' '},
        {' ', ' ', 'X', ' ', 'X', ' ', ' '},
        {' ', 'X', ' ', ' ', ' ', 'X', ' '},
        {'X', ' ', ' ', ' ', ' ', ' ', 'X'}
    };

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.print(array[i][j]);
      }
      System.out.println();

    }

    return new char[0][0];
  }
}