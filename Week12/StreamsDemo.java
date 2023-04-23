import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "data1.dat";
        String data = "Programming Principles II with JavA";
        System.out.println(readData(data));

        writeData(fileName, data);
        // readData(fileName);

    }

    static void writeData(String path, String data) {
        try(FileOutputStream fos = new FileOutputStream(path)) {
           byte[] bytes = data.getBytes();
           fos.write(bytes);
        } catch(IOException e) {
            e.printStackTrace();
        } 
    }

    static String readData(String path) {
        StringBuilder sb = new StringBuilder();
        try (var fis = new FileInputStream(path)) {
            //int b;
            //while((b=fis.read()) != -1)
            byte[] buf = new byte[8];
            int len;
            while((len = fis.read(buf)) > 0) sb.append(new String(buf, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString() ;
    }
}