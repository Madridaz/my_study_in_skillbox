import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

  public static void main(String[] args) {

    while (true) {
      System.out.println("Введите номер автомобиля");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      Scanner scanner1 = new Scanner(System.in);
      System.out.println(
          "Выберите операцию: 1 - поиск перебором, 2 - бинарный поиск, 3 - поиск в HashSet, 4 - поиск в TreeSet");
      String operation = scanner1.nextLine();

      //поиск перебором работает
      if (operation.contains("1")) {
        long start = System.nanoTime();
        CoolNumbers.bruteForceSearchInList(CoolNumbers.generateCoolNumbers(), input);
        long dif = (System.nanoTime() - start) / 1000000;
        if (CoolNumbers.bruteForceSearchInList(CoolNumbers.generateCoolNumbers(), input)) {
          System.out.println("номер найден, поиск занял " + dif + "мс");
        } else {
          System.out.println("номер не найден, поиск занял " + dif + "мс");
          //System.out.println("количество номеров в списке - " + CoolNumbers.generateCoolNumbers().size()); 
        }
      }

      //бинарный поиск работает
      if (operation.contains("2")) {
        ArrayList<String> sortedCarNumbers = new ArrayList<String>();
        sortedCarNumbers.addAll(0, CoolNumbers.generateCoolNumbers());
        long start = System.nanoTime();
        CoolNumbers.binarySearchInList(sortedCarNumbers, input);
        long dif = (System.nanoTime() - start) / 1000000;
        if (CoolNumbers.binarySearchInList(sortedCarNumbers, input)) {
          System.out.println("номер найден, поиск занял " + dif + "мс");
        } else {
          System.out.println("номер не найден, поиск занял " + dif + "мс");
     //     System.out.println("количество номеров в списке - " + sortedCarNumbers.size());
        }
      }
      // поиск в HashSet работает
      else if (operation.contains("3")) {
        HashSet<String> hashSet = new HashSet<>(CoolNumbers.generateCoolNumbers());
        long start = System.nanoTime();
        CoolNumbers.searchInHashSet(hashSet, input);
		long dif = (System.nanoTime() - start) / 1000000;
        if(CoolNumbers.searchInHashSet(hashSet, input)) {
          System.out.println("номер найден, поиск занял " + dif + "мс");
        } else {
          System.out.println("номер не найден, поиск занял " + dif + "мс");
    //      System.out.println("количество номеров в списке - " + hashSet.size());
        }
      }
      // поиск в TreeSet работает
      else if (operation.contains("4")) {
       TreeSet<String> treeSet = new TreeSet<>(CoolNumbers.generateCoolNumbers());
        long start = System.nanoTime();
        CoolNumbers.searchInTreeSet(treeSet, input);
		long dif = (System.nanoTime() - start) / 1000000;
        if(CoolNumbers.searchInTreeSet(treeSet, input)) {
          System.out.println("номер найден, поиск занял " + dif + "мс");
        } else {
          System.out.println("номер не найден, поиск занял " + dif + "мс");
    //      System.out.println("количество номеров в списке - " + hashSet.size());
        }
      }
    }
  }
}
