package EX;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String path = "/Users/macbook/pp2-course-work/Week12/EX/data1.dat";
        String data = "Programming Principles II with Java";
        writeData(path, data);
        System.out.println(readData(path));
    }

    static void writeData(String path, String data) {
        try (FileOutputStream fos = new FileOutputStream(path, false)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readData(String path) {
        StringBuilder sb = new StringBuilder();
        try (var fis = new FileInputStream(path)) {
            int length;
            byte buffer[] = new byte[8];
            while ((length = fis.read(buffer)) != -1)
                sb.append(new String(buffer, 0, length));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
