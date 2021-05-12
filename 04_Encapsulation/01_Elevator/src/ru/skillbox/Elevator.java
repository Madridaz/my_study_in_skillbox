package ru.skillbox;

public class Elevator {
    int minFloor;
    int maxFloor;
    int currentFloor = 1;
    int floor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor--;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void move(int floor) throws InterruptedException {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Этаж не существует");
        } else if (floor == currentFloor) {
            System.out.println("Вы находитесь на этом этаже");
        } else if (currentFloor < floor) {
            while (currentFloor != floor) {
                System.out.println("этаж № " + getCurrentFloor());
                moveUp();
                Thread.sleep(200);
            }
            System.out.println("ваш этаж № " + floor);

        } else if (currentFloor > floor) {
            while (currentFloor != floor) {
                System.out.println("этаж № " + getCurrentFloor());
                moveDown();
                Thread.sleep(200);
            }
            System.out.println("ваш этаж № " + floor);
        }
    }
}
