package ru.skillbox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            Scanner scanner = new Scanner(System.in);
            int floor = scanner.nextInt();
            elevator.move(floor);
        }

    }
}
