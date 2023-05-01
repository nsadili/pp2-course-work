package PW;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {





        try {
            FileWriter writer = new FileWriter("ex.txt");
            writer.write("Hello, world!\n");
            writer.write("Here's an example of making a file.\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("While writing to the file, something went wrong.");
            e.printStackTrace();
        }




        try {
            FileReader reader = new FileReader("ex.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("While writing to the file, something went wrong.");
            e.printStackTrace();
        }




        try {
            FileReader reader = new FileReader("ex.txt");
            char[] buffer = new char[1024];
            int length = reader.read(buffer);
            while (length != -1) {
                System.out.print(new String(buffer, 0, length));
                length = reader.read(buffer);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("While writing to the file, something went wrong.");
            e.printStackTrace();
        }
    }
}
