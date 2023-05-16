package Week12;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamsDemo {
    public static void main(String[] args) {
        String data = "This is just an example of text";

        try(FileOutputStream fos = new FileOutputStream("Week12/output.txt")) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
        String content = "";
        try(FileInputStream fis = new FileInputStream("Week12/output.txt")) {
            int ch;
            while((ch = fis.read()) != -1) {
                content += (char)ch;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            System.out.println(content);
        }


        try(FileInputStream fis = new FileInputStream("Week12/output.txt")) {
            byte[] array = new byte[10];
            int ch;
            fis.read(array);
            content = new String(array, 0, array.length);
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            System.out.println(content);
        }
    }
}