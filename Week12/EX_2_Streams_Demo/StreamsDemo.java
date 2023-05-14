import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "data1.dat";
        String data = "Programming Principles II with JavA";

        writeData(fileName, data);
        checkFileContent(fileName);
        String readData1 = readData1(fileName);
        System.out.println("Read data using read() method: " + readData1);
        String readData2 = readData2(fileName);
        System.out.println("Read data using read(byte[]) method: " + readData2);
    }

    static void writeData(String fileName, String data) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void checkFileContent(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] bytes = fis.readAllBytes();
            System.out.println("File content: " + new String(bytes, StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readData1(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                sb.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    static String readData2(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                sb.append(new String(buffer, 0, bytesRead, StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
