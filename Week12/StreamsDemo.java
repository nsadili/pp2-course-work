import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        //String filePath = "Resources/ex1/data1.txt";
        String filePath = "Week12/data1.txt";
        String data = "Programming Principles II with JavA";

        writeData(filePath, data);
        //readData(filePath);
        System.out.println(readData(filePath));

    }

    static void writeData(String path, String data) {

        try(FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* static void readData(String path) {
        try(FileInputStream fis = new FileInputStream(path)) {
            int n;
            while((n = fis.read()) != -1) {
            System.out.print((char)n);   
        } 
        }catch (IOException e) {
            e.printStackTrace();
        }
    } */

    /* static void readData(String path) {
        try(FileInputStream fis = new FileInputStream(path)) {
               byte[] bytes = new byte[8];
               int len;
               while((len = fis.read(bytes)) != -1) {
                    System.out.print(new String(bytes, 0, len));
               }
            }catch (IOException e) {
            e.printStackTrace();
        }
    } */

    static StringBuilder readData(String path) {
        StringBuilder sb = new StringBuilder();
        try(FileInputStream fis = new FileInputStream(path)) {
               byte[] bytes = new byte[8];
               int len;
               while((len = fis.read(bytes)) != -1) {
                    sb.append(new String(bytes, 0, len));
               }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return sb;
    }
}