import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo2 {
    public static void main(String[] args) {
        String data = "A data of string";

        try(FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
        String content = "";
        try(FileInputStream fis = new FileInputStream("output.txt")) {
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


        try(FileInputStream fis = new FileInputStream("output.txt")) {
            byte[] array = new byte[16];
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