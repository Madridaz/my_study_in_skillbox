package ru.skillbox;

public enum KeyboardType {
    SMALL("без цифрового блока"), FULLSIZE("полноразмерная");
    private String translation;

    KeyboardType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
