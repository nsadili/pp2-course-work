package Week12;

import java.io.*;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "Resources/ex1/data1.dat";
        String data = "Programming Principles II with JavA";

        writeData(fileName, data);
        readData(fileName);
    }

    static void writeData(String path, String data) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data written to " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readData(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
         
            System.out.println("Reading data using read() method:");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }

         
            System.out.println("\nReading data using read(byte[]) method:");
            byte[] bytes = new byte[1024];
            int length = fis.read(bytes);
            String data = new String(bytes, 0, length);
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







