import java.io.*;

public class DuplicateFilesDemo {

    public static void main(String[] args) {
        String originalFilePath = "original.txt";
        String duplicateFilePath = "duplicate.txt";

        try {
            FileInputStream fis = new FileInputStream(originalFilePath);
            FileOutputStream fos = new FileOutputStream(duplicateFilePath);
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
            fis.close();
            fos.close();
            System.out.println("File duplicated byte-by-byte.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis1 = new FileInputStream(originalFilePath);
            FileInputStream fis2 = new FileInputStream(duplicateFilePath);
            int ch1, ch2;
            boolean isSame = true;
            while ((ch1 = fis1.read()) != -1 && (ch2 = fis2.read()) != -1) {
                if (ch1 != ch2) {
                    isSame = false;
                    break;
                }
            }
            fis1.close();
            fis2.close();
            if (isSame) {
                System.out.println("Duplicate file is same as original file.");
            } else {
                System.out.println("Duplicate file is different from original file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(originalFilePath);
            FileOutputStream fos = new FileOutputStream(duplicateFilePath);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            fis.close();
            fos.close();
            System.out.println("File duplicated using array copying.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis1 = new FileInputStream(originalFilePath);
            FileInputStream fis2 = new FileInputStream(duplicateFilePath);
            byte[] buffer1 = new byte[1024];
            byte[] buffer2 = new byte[1024];
            int length1, length2;
            boolean isSame = true;
            while ((length1 = fis1.read(buffer1)) > 0 && (length2 = fis2.read(buffer2)) > 0) {
                if (!java.util.Arrays.equals(buffer1, buffer2)) {
                    isSame = false;
                    break;
                }
            }
            fis1.close();
            fis2.close();
            if (isSame) {
                System.out.println("Duplicate file is same as original file.");
            } else {
                System.out.println("Duplicate file is different from original file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
