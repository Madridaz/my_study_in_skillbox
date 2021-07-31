import com.google.common.io.Files;

import java.io.File;

public class FileUtils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory) {
        // TODO: write code copy content of sourceDirectory to destinationDirectory
        File source = new File(sourceDirectory);
        File destination = new File(destinationDirectory);
        try {
            Files.copy(source, destination);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
