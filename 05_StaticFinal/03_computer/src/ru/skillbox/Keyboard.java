package ru.skillbox;

public class Keyboard {
    private final KeyboardType keyboardType;
    private final IsLightType isLightType;
    private final double weight;

    public Keyboard(KeyboardType keyboardType, IsLightType isLightType, double weight) {
        this.keyboardType = keyboardType;
        this.isLightType = isLightType;
        this.weight = weight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public IsLightType getIsLightType() {
        return isLightType;
    }

    public double getWeight() {
        return weight;
    }
}
