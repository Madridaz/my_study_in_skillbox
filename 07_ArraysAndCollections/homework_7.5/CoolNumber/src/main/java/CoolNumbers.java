import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CoolNumbers {

  //метод для заполнения списка нужным количеством сгенерированных номеров
  public static List<String> generateCoolNumbers() {
    List<String> carNumbers = new ArrayList<>();
    for (int i = 0; i < 2_000_001; i++) {
      carNumbers.add(generateOneNumber());
    }
    System.out.println(carNumbers);

    return carNumbers;
  }

  public static boolean bruteForceSearchInList(List<String> list, String number) {
    if (list.contains(number)) {
      return true;
    }
    return false;
  }

  public static boolean binarySearchInList(List<String> sortedList, String number) {
    int index = Collections.binarySearch(sortedList, number);
    if (index >= 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
    if (hashSet.contains(number)) {
      return true;
    }

    return false;
  }

  public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
    if (treeSet.contains(number)) {
      return true;
    }
    return false;
  }

  //метод для генерации одного автомобильного номера
  public static String generateOneNumber() {
    final char[] carLetters = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};

    //первая буква номера
    int x = (int) Math.floor(Math.random() * carLetters.length);
    char letterX = carLetters[x];

    //трехзначное число
    String num = Integer.toString((int) (Math.random() * 1000));

    //вторая буква номера
    int y = (int) Math.floor(Math.random() * carLetters.length);
    char letterY = carLetters[y];

    //третья буква номера
    int z = (int) Math.floor(Math.random() * carLetters.length);
    char letterZ = carLetters[z];

    //номер региона
    String reg = Integer.toString((int) (Math.random() * 100));

    //преобразование всех элементов в единый номер и возврат его
    String result = letterX + num + letterY + letterZ + reg;
    //System.out.println(result);
    return result;
  }

}
