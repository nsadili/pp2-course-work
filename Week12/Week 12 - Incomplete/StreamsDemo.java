import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String path = "Resources/ex1/data1.dat";
        String data = "Nariman Mammadov";

        writeData(path, data);
        
        System.out.println(readData(path));

    }

    static void writeData(String path, String data) {

        try(FileOutputStream fos = new FileOutputStream(path)){
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static String readData(String path) {

        String res ="";
        StringBuilder sb = new StringBuilder();
        try (var fis = new FileInputStream(path)){
            int len;
            byte[] buffer = new byte[8];

            while((len=fis.read(buffer)) != -1)
            {
                sb.append(new String(buffer, 0, len));
            // res+=(new String(buffer,0,len));
            }

            // int b;
            // while((b=fis.read()) != -1){
            //     System.out.print((char) b);
            // }

        } catch(IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
