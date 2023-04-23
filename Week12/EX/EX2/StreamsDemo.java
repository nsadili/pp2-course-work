package EX.EX2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String path = "/Users/macbook/pp2-course-work/Week12/EX/EX2/data1.dat";
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
            int len;
            byte buffer[] = new byte[8];
            while ((len = fis.read(buffer)) != -1)
                sb.append(new String(buffer, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
