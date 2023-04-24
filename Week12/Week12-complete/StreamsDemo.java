import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "Resources/ex1/data1.dat";
        String data = "Programming Principles II with JavA";

        writeData(fileName, data);
        readData(fileName);

    }

    static void writeData(String path, String data) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readData(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            int d;
            while ((d = fis.read()) > 0) {
                System.out.print((char) d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
