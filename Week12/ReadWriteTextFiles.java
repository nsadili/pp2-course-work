package Week12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFiles {
    public static void main(String[] args) {
        try (FileWriter fr = new FileWriter("Week12/sometext.txt")) {
            fr.write("this is some text");
        } catch (IOException e) {
            System.out.println(e);
        }

        String text = "";
        try(FileReader fread = new FileReader("Week12/sometext.txt")) {
            int ch;
            while ((ch = fread.read()) != -1) {
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