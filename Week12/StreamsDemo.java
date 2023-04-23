import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class StreamsDemo {
    public static void main(String[] args) {
        String path = "Resources/ex1/data1.txt";
        String data = "Programming Principles II with JavA";

     writeData(path, data);
       System.out.println(readData(path));

    }

    static void writeData(String path, String data) {

       byte [] bytes = data.getBytes();
        
        try(FileOutputStream fos = new FileOutputStream(path)){

            fos.write(data.getBytes());
    
        } catch(IOException e){
        e.printStackTrace();
       }
    }

    static String readData(String path) {
        StringBuilder sb = new StringBuilder();

        try (FileInputStream fis = new FileInputStream(path)) {

            byte[] bytes = new byte[8];
            int len;

            while ((len = fis.read(bytes)) !=-1) {
                sb.append(new String(bytes, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
