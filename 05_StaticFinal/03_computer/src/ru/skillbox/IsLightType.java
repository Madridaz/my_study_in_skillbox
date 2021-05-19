package ru.skillbox;

public enum IsLightType {
    YES("есть"), NO("нет");
    private String translation;

    IsLightType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
