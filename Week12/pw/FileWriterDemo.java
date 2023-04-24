import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String fileName = "file1.txt";
        String data = "Hello World!";
        writeData(fileName, data);
    }

    static void writeData(String name, String data){
        try(FileWriter writer = new FileWriter(name)){
         writer.write(data);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
