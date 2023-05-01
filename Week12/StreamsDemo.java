import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String filePath = "Resources/ex1/data1.txt";
        String data = "Programming Principles II with JavA";

        // writeData(filePath, data);
        readData(filePath);

    }

    static void writeData(String path, String data) {
        byte[] bytes = data.getBytes();

        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        /* finally{
         fos.close();
         }*/

    }

    static void readData(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            /*int ch;
            while ((ch = fis.read())!=-1){
            System.out.print((char)ch);}*/

            byte[] bytes= new byte[8];
            fis.read(bytes);
            while(fis.read(bytes) >0){
                System.out.print(new String(bytes));
            }

        }
             catch (IOException e) {
            e.printStackTrace();
        }
    }
}