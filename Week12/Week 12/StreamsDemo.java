import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "Resources/ex1/data1.txt";
        String data = "Programming Principles II with JavA";

        writeData(fileName, data);
        System.out.println(readDataV2(fileName));
        

    }

    static void writeData(String path, String data) {
        
        try (FileOutputStream file = new FileOutputStream(path, false)) {

            file.write(data.getBytes());
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void readDataV1(String path) {
       
        try (FileInputStream fis = new FileInputStream(path)) {

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();

        } catch (IOException e) {
           
            e.printStackTrace();
        }
    }

    static String readDataV2(String path) {
        
        StringBuilder res = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(path)) {

            byte[] arr = new byte[8];

            // fis.read(arr);
            int len;
            char[] charArr = new char[8];
            CharBuffer charBuffer = null;

            while ((len = fis.read(arr)) > 0) {
                charBuffer =  Charset.forName("UTF-8").decode(ByteBuffer.wrap(arr));

                 charArr = charBuffer.array(); 

                res.append(charArr, 0, len);

            }

        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return res.toString();
    }
}