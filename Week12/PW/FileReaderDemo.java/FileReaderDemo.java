import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
       String fileName = "file1.txt";
      System.out.println(readData(fileName));
    }

     //read(char[]) method
    static String readData(String name){
        StringBuilder sb = new StringBuilder();
        try(FileReader reader = new FileReader(name)){
            char[]  buf = new char[8];
            int len;
            while((len = reader.read(buf)) > 0){
                sb.append(new String(buf, 0, len));
            }

            //read() method
            int ch;
            while((ch = reader.read())  != -1){
                sb.append((char) ch);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}