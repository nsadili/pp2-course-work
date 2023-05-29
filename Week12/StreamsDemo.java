import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String filePath = "Resources/ex1/data1.txt";
        String data = "Programming Principles II with Java <3";

        writeData(filePath, data);
        readData(filePath);
        System.out.println(readAndReturnData(filePath));

    }

    static void writeData(String path, String data) {
        try (FileOutputStream file = new FileOutputStream(path)) {

            file.write(data.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readData(String path) {
        try (FileInputStream fos = new FileInputStream(path)) {
            int ch;
            while ((ch = fos.read()) > 0) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    static String readAndReturnData(String path) {
        StringBuilder str = new StringBuilder();
        try (FileInputStream fos = new FileInputStream(path)) {
            int len;
            byte buffer[] = new byte[8];
            while ((len = fos.read(buffer)) > 0)
                str.append(new String(buffer, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }
}