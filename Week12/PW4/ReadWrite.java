package PW4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class ReadWrite {
    public static void main(String[] args) {
        try {

            File file = new File("/Users/macbook/pp2-course-work/Week12/PW4/TextFile.txt");
            FileReader reader = new FileReader(file);
            FileWriter writer = new FileWriter("/Users/macbook/pp2-course-work/Week12/PW4/TextFile.txt", false);
            
            writer.write("Hey there!");
            writer.close();

            Scanner scanner = new Scanner(System.in);
            System.out.print("How many characters to read? ");
            int len = scanner.nextInt();
            char [] cbuf = new char[100];
            reader.read(cbuf, 0, len);
            System.out.println("Reading.. Info: " + new String(cbuf, 0, cbuf.length));
            reader.close();
            scanner.close();

        } catch (IOException e) {

            System.out.println("Error occured: " + e.getMessage());
            e.printStackTrace();

        }
    }
}
