import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageCutter extends Thread {
    private File[] files;
    private int newWidth;
    private String dstFolder;
    private long start;
    private int targetWidth = 960;
    private int targetHeight = 540;

    public ImageCutter(File[] files, int newWidth, String dstFolder, long start) {
        this.files = files;
        this.newWidth = newWidth;
        this.dstFolder = dstFolder;
        this.start = start;
    }

    @Override
    public void run() {
        try {
            for (File file : files) {
                BufferedImage image = ImageIO.read(file);
                if (image == null) {
                    continue;
                }
                Image resultingImage = image.getScaledInstance(targetWidth, targetHeight, Image.SCALE_AREA_AVERAGING);
                BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
                outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);

                File newFile = new File(dstFolder + "/" + file.getName());
                ImageIO.write(outputImage, "jpg", newFile);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Процесс обрезки завершен через: " + (System.currentTimeMillis() - start) + " мс.");


    }
}
