package Week12;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadingWrittenTextFiles {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("Week12/sometext.txt")) {
            fileWriter.write("Hello sir");
        } catch (IOException e) {
            System.out.println(e);
        }

        String text = "";
        try(FileReader fileReader = new FileReader("Week12/sometext.txt")) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                text += (char)ch;
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println(text);
        }


        try(FileReader fread = new FileReader("Week12/sometext.txt")) {
            char[] array = new char[12];
            int number = fread.read(array);
            text = new String(array, 0, number);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println(text);
        }
    }
}
