package Week12;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "/Users/alvin/Documents/GitHub/pp2-course-work/Week12/Resources/ex1/data1.txt";
        String data = "Programming";

        writeData(fileName, data);
        readData(fileName);

    }

    static void writeData(String path, String data) {
        try (FileOutputStream fos = new FileOutputStream(path , false)){
            fos.write(data.getBytes());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readData(String path) {
        StringBuilder res = new StringBuilder();
        try (var fis = new FileInputStream(path)) {
            int len;
            byte buffer[] = new byte[8];
            while ((len = fis.read(buffer) )!= -1)
                res.append(new String(buffer, 0 , len));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res.toString();
    }
}
