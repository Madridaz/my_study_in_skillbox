package ru.skillbox;

public class Rom {
    private final int memorySize;
    private final double weight;
    private final MemoryType memoryType;


    public Rom(MemoryType memoryType, int memorySize, double weight) {
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

    public MemoryType getRomType() {
        return memoryType;
    }
}
