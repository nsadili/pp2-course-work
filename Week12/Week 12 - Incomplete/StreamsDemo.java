import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "Resources/ex1/data1.dat";
        String data = "Programming Principles II with JavA";

        writeData(fileName, data);
        System.out.println(readDataV2(fileName)); 

    }

    static void writeData(String path, String data) {
        try(FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readData(String path) {
        try (FileInputStream fis = new FileInputStream(path)){
            
            int ch;

            while((ch = fis.read()) != -1){
                System.out.print((char) ch);
            }

            
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    static String readDataV2(String path){
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(path)){
        byte[] bytes = new byte[8];
        int len;
      
        while((len = fis.read(bytes)) > 0){
           sb.append(new String(bytes, 0, len));
        }
       } catch (IOException e) {
            e.printStackTrace();
       }
       return sb.toString();
    }
}
