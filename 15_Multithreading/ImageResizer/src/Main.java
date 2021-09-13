import java.io.File;

public class Main {
    private static int newWidth = 300;
    private static int processors = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) throws InterruptedException {
        String srcFolder = "C:\\Users\\home\\Desktop\\src";
        String dstFolder = "C:\\Users\\home\\Desktop\\dst";

        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();

        long start = System.currentTimeMillis();

        System.out.println("Количество потоков у процессора - " + processors);
        Thread.sleep(2000);

        System.out.println("Число активных потоков из данного потока (до запуска процедуры обрезки изображений): "
                + Thread.activeCount());
        Thread.sleep(2000);

        for (int i = 0; i < processors; i++) {
            ImageCutter imageCutter = new ImageCutter(files, newWidth, dstFolder, start);
            imageCutter.start();

        }

        System.out.println("Число активных потоков из данного потока (после запуска процесса обрезки изображений): "
                + Thread.activeCount());
        Thread.sleep(2000);
    }
}
