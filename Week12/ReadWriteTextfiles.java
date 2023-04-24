import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextfiles {
    public static void main(String[] args) {

        String filePath = "Week12/data1.txt";
        String data = "Read/Write Text Files";

        writeData(filePath, data);
        readData(filePath);
        
        try (FileWriter fw = new FileWriter("data1.txt")) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeData(String path, String data) {

        try (FileWriter fw = new FileWriter(path)) {
            fw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readData(String path) {
        try (FileReader fr = new FileReader(path)) {
            int n;
            while((n = fr.read()) != -1) {
                System.out.print((char)n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }

}
