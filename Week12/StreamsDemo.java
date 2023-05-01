import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "Resources/ex1/data1.dat";
        String data = "Programming Principles II with JavA";

        // writeData(fileName, data);
        readData(fileName);

    }

    static void writeData(String path, String data) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readData(String path) {
        StringBuilder sb = new StringBuilder();
        try (var fis = new FileInputStream(path)) {
            byte[] buf = new byte[8];
            int len;
            while ((len = fis.read(buf)) != -1)
                sb.append(new String(buf, 0, len));
            // System.out.print(new String(buf, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
