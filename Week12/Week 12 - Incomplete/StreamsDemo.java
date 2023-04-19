import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "Resources/ex1/data1.dat";
        String data = "Programming Principles II with JavA";

        writeData(fileName, data);
        System.out.println(readData(fileName));

    }

    static void writeData(String path, String data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readData(String path) {
        String res="";
        StringBuilder sb=new StringBuilder();
        int len;
        try {
            FileInputStream fis = new FileInputStream(path);

            // int ch;
            // while ((ch=fis.read())!=-1){
            //     System.out.print((char)ch);
            // }
            // System.out.println(ch);

            byte[] bytes = new byte[8];

            while ((len=fis.read(bytes))>0){
                res+=new String(bytes);
                sb.append(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
