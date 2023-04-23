import java.io.FileInputStream;
// import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String filePath = "Resources/ex1/data1.txt";

        String data = "Programming Principles II with JavA";

        // writeData(filePath, data);
        // readDataV2(filePath);
        System.out.println(readDataV2(filePath));
    }

    static void writeData(String path, String data) {
        // byte[] bytes = data.getBytes();

        try (FileOutputStream fos = new FileOutputStream(path)) {

            // write the data into fos
            fos.write(data.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // static void readDataV1(String path) {
    // try (FileInputStream fis = new FileInputStream(path)) {

    // // char ch = (char) fis.read();
    // int ch;
    // while ((ch = fis.read()) != -1) {
    // System.out.println((char) ch);
    // }

    // System.out.println();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }

    static String readDataV2(String path) {
        String res = "";
        StringBuilder sb = new StringBuilder();

        try (FileInputStream fis = new FileInputStream(path)) {

            byte[] bytes = new byte[8];
            // fis.read(bytes);
            int len;

            // while (fis.read(bytes) != -1) {
            // System.out.print(new String(bytes));
            // // bytes = new byte[8];

            while ((len = fis.read(bytes)) > 0) {
                // System.out.print(new String(bytes, 0, len));

                // res += new String(bytes, 0, len);
                sb.append(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
