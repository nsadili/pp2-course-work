package week12;

import java.io.*;
import java.nio.channels.FileChannel;

public class DuplicateFiles {

    public static void main(String[] args) {

        String originalFilePath = "original/file";
        String duplicateFilePath = "duplicate/file";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {

            File originalFile = new File(originalFilePath);
            File duplicateFile = new File(duplicateFilePath);

            inputStream = new FileInputStream(originalFile);
            outputStream = new FileOutputStream(duplicateFile);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            boolean filesAreEqual = originalFile.length() == duplicateFile.length() &&
                    new FileInputStream(originalFile).getChannel()
                            .map(FileChannel.MapMode.READ_ONLY, 0, originalFile.length())
                            .equals(new FileInputStream(duplicateFile).getChannel()
                                    .map(FileChannel.MapMode.READ_ONLY, 0, duplicateFile.length()));

            System.out.println(filesAreEqual);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
