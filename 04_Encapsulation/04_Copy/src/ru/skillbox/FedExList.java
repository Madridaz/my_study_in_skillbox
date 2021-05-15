package ru.skillbox;

public class FedExList {
    private final double weight;
    private final String deliveryAddress;
    private final boolean isItPossibleToFlip;
    private final String regNumber;
    private final boolean isTheCargoFragile;

    public FedExList(double weight, String deliveryAddress, boolean isItPossibleToFlip, String regNumber, boolean isTheCargoFragile) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.isItPossibleToFlip = isItPossibleToFlip;
        this.regNumber = regNumber;
        this.isTheCargoFragile = isTheCargoFragile;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isItPossibleToFlip() {
        return isItPossibleToFlip;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isTheCargoFragile() {
        return isTheCargoFragile;
    }


}
