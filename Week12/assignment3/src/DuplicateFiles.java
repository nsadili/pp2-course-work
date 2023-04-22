import java.io.*;

public class DuplicateFiles {
    public static void main(String[] args) {
        String originalFilePath = "org-file.txt";
        String duplicateFilePath = "dup-file.txt";

        try {
            File originalFile = new File(originalFilePath);
            File duplicateFile = new File(duplicateFilePath);

            InputStream input = new FileInputStream(originalFile);
            OutputStream output = new FileOutputStream(duplicateFile);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }

            input.close();
            output.close();

            if (originalFile.length() == duplicateFile.length()) {
                System.out.println("\nA duplicate of the original file has been created and it is identical.\n");
            } else {
                System.out.println(
                        "\nA duplicate of the original file has been created, but it isn't identical.\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
