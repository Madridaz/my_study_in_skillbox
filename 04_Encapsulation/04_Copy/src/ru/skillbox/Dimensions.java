package ru.skillbox;

public class Dimensions {
    private final double length;
    private final double height;
    private final double width;

    public Dimensions(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getVolume() {
        return length * height * width;
    }
}
