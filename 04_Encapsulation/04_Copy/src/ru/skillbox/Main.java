package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(3,3,3);
        dimensions.getVolume();

        FedExList list = new FedExList(10.5, "ул. Ленина, 5", true,"A500s98",false);

    }
}
