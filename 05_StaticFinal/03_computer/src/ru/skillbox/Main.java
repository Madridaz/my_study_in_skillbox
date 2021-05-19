package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        //создание 3 компьютеров
        Cpu cpu = new Cpu(2.0, 4, "AMD", 55.5);
        Rom rom = new Rom(MemoryType.HDD, 1000, 158.7);
        Ram ram = new Ram(4096, 20.9, MemoryType.DDR3);
        Monitor monitor = new Monitor(17, MonitorType.IPS, 800);
        Keyboard keyboard = new Keyboard(KeyboardType.FULLSIZE, IsLightType.YES, 120);

        Cpu cpu1 = new Cpu(2.8, 2, "AMD", 65.7);
        Rom rom1 = new Rom(MemoryType.SSD, 2000, 180);
        Ram ram1 = new Ram(6144, 25, MemoryType.DDR4);
        Monitor monitor1 = new Monitor(15, MonitorType.TN, 500);
        Keyboard keyboard1 = new Keyboard(KeyboardType.SMALL, IsLightType.NO, 100);

        Cpu cpu2 = new Cpu(3.0, 8, "Intel", 60);
        Rom rom2 = new Rom(MemoryType.SSD, 1000, 140);
        Ram ram2 = new Ram(4096, 21.5, MemoryType.DDR4);
        Monitor monitor2 = new Monitor(19, MonitorType.VA, 800);
        Keyboard keyboard2 = new Keyboard(KeyboardType.SMALL, IsLightType.YES, 85);

        Computer computer = new Computer("Lenovo", "LS30U", cpu, rom, ram, monitor, keyboard);
        Computer computer1 = new Computer("Asus", "BGT45S", cpu1, rom1, ram1, monitor1, keyboard1);
        Computer computer2 = new Computer("HP", "35UDF7", cpu2, rom2, ram2, monitor2, keyboard2);

        System.out.println(computer + "Вес устройства - " + computer.deviceWeight() + " гр." + "\n");
        System.out.println(computer1 + "Вес устройства - " + computer1.deviceWeight() + " гр." + "\n");
        System.out.println(computer2 + "Вес устройства - " + computer2.deviceWeight() + " гр." + "\n");
    }
}
