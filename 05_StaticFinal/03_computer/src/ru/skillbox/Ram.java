package ru.skillbox;

public class Ram {
    private final int memorySize;
    private final double weight;
    private final MemoryType memoryType;


    public Ram(int memorySize, double weight, MemoryType memoryType) {
        this.memorySize = memorySize;
        this.weight = weight;
        this.memoryType = memoryType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getWeight() {
        return weight;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }
}
