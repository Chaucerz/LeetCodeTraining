package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Chaucer
 * @date 2020-03-06 20:24
 */
public class TestFile {
    public static void main(String args[]) {
        File file = new File("G:\\solc\\fuck.txt");
        File file1 = new File("G:\\solc\\fuck1.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        file.renameTo(file1);

    }
}
