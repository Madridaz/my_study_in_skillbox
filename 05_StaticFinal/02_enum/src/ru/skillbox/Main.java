package ru.skillbox;

import ru.skillbox.ArithmeticCalculator;
import ru.skillbox.Operation;

public class Main {

  public static void main(String[] args) {
    ArithmeticCalculator calc = new ArithmeticCalculator(2, 3);
    calc.calculate(Operation.ADD);
    calc.calculate(Operation.SUBTRACT);
    calc.calculate(Operation.MULTIPLY);
    
  }
}
