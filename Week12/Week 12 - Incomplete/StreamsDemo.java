import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "Resources/ex1/data1.txt";
        String data = "Programming Principles II with JavA";

        // writeData(fileName, data);
        System.out.println(readDataV2(fileName));;

    }

    static void writeData(String path, String data) {
        // TODO
        try (FileOutputStream file = new FileOutputStream(path, false)) {

            file.write(data.getBytes());
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void readDataV1(String path) {
        // TODO

        try (FileInputStream fis = new FileInputStream(path)) {

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();

        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    static String readDataV2(String path) {
        // TODO
        StringBuilder res = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(path)) {

           byte[] arr = new byte[8];
            // fis.read(arr);
            int len;
            while( (len = fis.read(arr)) > 0){
            //    System.out.print(new String(arr, 0, len));
                res.append(new String(arr, 0, len ));
          
            //  System.out.print(new String(arr));               

            }

        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return res.toString();
    }
}
