package ru.skillbox;

import ru.skillbox.Dimensions;

public class FedExList {
  private final Dimensions dimensions;
  private double weight;
  private String deliveryAddress;
  private boolean isItPossibleToFlip;
  private String regNumber;
  private boolean isTheCargoFragile;

  public FedExList(
      Dimensions dimensions,
      double weight,
      String deliveryAddress,
      boolean isItPossibleToFlip,
      String regNumber,
      boolean isTheCargoFragile) {
    this.dimensions = dimensions;
    this.weight = weight;
    this.deliveryAddress = deliveryAddress;
    this.isItPossibleToFlip = isItPossibleToFlip;
    this.regNumber = regNumber;
    this.isTheCargoFragile = isTheCargoFragile;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public boolean getisItPossibleToFlip() {
    return isItPossibleToFlip;
  }

  public String getRegNumber() {
    return regNumber;
  }

  public boolean getIsTheCargoFragile() {
    return isTheCargoFragile;
  }

  public String toString() {
    return "вес - "
        + weight
        + ", "
        + "адрес - "
        + deliveryAddress
        + ", "
        + "можно ли переворачивать - "
        + isItPossibleToFlip
        + ", "
        + "номер - "
        + regNumber
        + ", "
        + "хрупкий товар - "
        + isTheCargoFragile
        + ".";
  }
}
