package ru.skillbox;

import ru.skillbox.Operation;

public class ArithmeticCalculator {
  private int a;
  private int b;
  private int result;

  public ArithmeticCalculator(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void calculate(Operation operation) {
    switch (operation) {
      case ADD:
        System.out.println("Сумма равна: " + (result = a + b));
        break;
      case SUBTRACT:
        System.out.println("Разность равна: " + (result = a - b));
        break;
      case MULTIPLY:
        System.out.println("Произведение равно: " + (result = a * b));
        break;
    }
  }
}
