package PW;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        try {

            File file = new File("/Users/macbook/pp2-course-work/Week12/PW/TextFile.txt");
            FileReader reader = new FileReader(file);
            FileWriter writer = new FileWriter("/Users/macbook/pp2-course-work/Week12/PW/TextFile.txt", false);
            
            writer.write("Hello!");
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

            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();

        }
    }
}
