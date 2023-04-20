import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFiles {
    public static void main(String[] args) {
        String filePath = "Resources/ex4/pwfile.txt"; // realtive path

        String data = "Vasila Aliyeva BSIT-2026";

        writeData(filePath, data);
        readDataV1(filePath);
        System.out.println("Version 2-> "+readDataV2(filePath));

    }

    static void writeData(String path, String data) {
        try (FileWriter fw = new FileWriter(path)) {

            fw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void readDataV1(String path) {
        try (FileReader fr = new FileReader(path)) {

            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readDataV2(String path) {
        StringBuilder sb = new StringBuilder();

        try (FileReader fr = new FileReader(path)) {

            char[] arr = new char[8];
            int len;

            while ((len = fr.read(arr)) > 0) {
                sb.append(new String(arr, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
