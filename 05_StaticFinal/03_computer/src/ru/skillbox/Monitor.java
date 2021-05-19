package ru.skillbox;

public class Monitor {
    private final int diagonal;
    private final MonitorType monitorType;
    private final double weight;

    public Monitor(int diagonal, MonitorType monitorType, double weight) {
        this.diagonal = diagonal;
        this.monitorType = monitorType;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public double getWeight() {
        return weight;
    }
}
