package Week12.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String path = "Resources/ex1/data1.dat";
        String data = "Programming Principles II with JavA";

        // writeData(path, data);
        readData(path);

    }

    static void writeData(String path, String data) {

        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void readData(String path, int offset) {

        String res = " ";
        StringBuilder sb = new StringBuilder();
        try (var fis = new FileInputStream(path)) {

            int len;
            byte buffer [] = new byte [8];

            while ((len = fis.read(null)) != -1)
                sb.append(new String(buffer, offset:0, len));

            

        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
