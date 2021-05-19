package ru.skillbox;

public class Computer {
    private final String vendor;
    private final String name;
    Cpu cpu;
    Rom rom;
    Ram ram;
    Monitor monitor;
    Keyboard keyboard;

    public Computer(String vendor, String name, Cpu cpu, Rom rom, Ram ram, Monitor monitor, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.rom = rom;
        this.ram = ram;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public double deviceWeight() {
        return cpu.getWeight() + rom.getWeight() + ram.getWeight() + monitor.getWeight() + keyboard.getWeight();
    }

    public String toString() {
        return "\n" + "Производитель - " + vendor + ", " + "модель - " + name + "\n" +
                "Характеристики устройства: " + "\n" +
                "Процессор: частота - " + cpu.getFrequency() + " ГГц, " +
                "количество ядер - " + cpu.getNumberOfCores() + " шт, " +
                "производитель - " + cpu.getVendor() + ", " +
                "вес - " + cpu.getWeight() + " гр." + "\n" +
                "Жесткий диск: тип - " + rom.getRomType() + ", " +
                "объем памяти - " + rom.getMemorySize() + " Гб, " +
                "вес - " + rom.getWeight() + " гр." + "\n" +
                "Оперативная память: тип - " + ram.getMemoryType() + ", " +
                "объем памяти - " + ram.getMemorySize() + " Гб, " +
                "вес - " + ram.getWeight() + " гр." + "\n" +
                "Монитор: тип матрицы - " + monitor.getMonitorType() + ", " +
                "диагональ - " + monitor.getDiagonal() + " дюймов, " +
                "вес - " + monitor.getWeight() + " гр." + "\n" +
                "Клавиатура: тип - " + keyboard.getKeyboardType().getTranslation() + ", " +
                "наличие подсветки - " + keyboard.getIsLightType().getTranslation() + ", " +
                "вес - " + keyboard.getWeight() + " гр." + "\n";
    }
}
