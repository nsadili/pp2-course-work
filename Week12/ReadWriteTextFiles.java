package Week12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadWriteTextFiles {
    public static void main(String[] args) {
        try (FileWriter fr = new FileWriter("Week12/text.txt")) {
            fr.write("This is just an example of text");
        } catch (IOException e) {
            System.out.println(e);
        }
        String text = "";
        try(FileReader fread = new FileReader("Week12/text.txt")) {
            int ch;
            while ((ch = fread.read()) != -1) {
                text += (char)ch;
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println(text);
        }
        try(FileReader fread = new FileReader("Week12/text.txt")) {
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