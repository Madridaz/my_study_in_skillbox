import java.io.File;

public class Main {
    private static int newWidth = 300;

    public static void main(String[] args) {
        String srcFolder = "C:\\Users\\home\\Desktop\\src";
        String dstFolder = "C:\\Users\\home\\Desktop\\dst";

        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();

        //Intel(R) Pentium(R) CPU 4405U @ 2.10GHz содержит 2 ядра
        File[] files = srcDir.listFiles();
        int middle = files.length / 2;

        File[] coreOne = new File[middle];
        System.arraycopy(files, 0, coreOne, 0, coreOne.length);
        ImageCutter imageCutterCoreOne = new ImageCutter(coreOne, newWidth, dstFolder, start);
        imageCutterCoreOne.start();

        File[] coreTwo = new File[files.length - middle];
        System.arraycopy(files, middle, coreTwo, 0, coreTwo.length);
        ImageCutter imageCutterCoreTwo = new ImageCutter(coreTwo, newWidth, dstFolder, start);
        imageCutterCoreTwo.start();
    }
}
