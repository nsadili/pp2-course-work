import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String data = "Hello it's Said Ahadov";

        // Store data in a file using FileOutputStream
        storeData(data, "output.txt");

        // Check the content of the file
        checkFileContent("output.txt");

        // Read the contents of the file using FileInputStream
        String content1 = readDataUsingRead("output.txt");
        System.out.println("Content (using read()): " + content1);

        String content2 = readDataUsingReadBytes("output.txt");
        System.out.println("Content (using read(byte[])): " + content2);
    }

    public static void storeData(String data, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            System.out.println("Data stored in file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkFileContent(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int content;
            System.out.println("File content: ");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readDataUsingRead(String fileName) {
        StringBuilder content = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int data;
            while ((data = fis.read()) != -1) {
                content.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static String readDataUsingReadBytes(String fileName) {
        StringBuilder content = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                content.append(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
