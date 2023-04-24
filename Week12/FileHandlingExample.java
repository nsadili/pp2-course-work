import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String data = "Hello, world!"; // The string we want to store in a file

        // Step 1: Store the bytes of the string in a file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Step 2: Check the content of the file
        try {
            FileInputStream fis = new FileInputStream("output.txt");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            fis.close();
            System.out.println("\nFile read successfully using read() method.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Step 3(i): Read the contents of the file using FileInputStream using read() method
        try {
            FileInputStream fis = new FileInputStream("output.txt");
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            String result = new String(bytes);
            System.out.println("File read successfully using read() method: " + result);
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Step 3(ii): Read the contents of the file using FileInputStream using read(byte[]) method
        try {
            FileInputStream fis = new FileInputStream("output.txt");
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            String result = new String(bytes);
            System.out.println("File read successfully using read(byte[]) method: " + result);
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

// In this example, we first create a string data with the value "Hello, world!". 
// We then use a FileOutputStream to write the bytes of this string to a file called "output.txt". 
// We then use a FileInputStream to read the contents of this file, 
// first using the read() method to read one byte at a time and print it to the console, 
// and then using the read(byte[]) method to read all the bytes at once into a byte array, 
// convert the byte array to a string, and print it to the console. 
// Finally, we close the FileInputStream and catch any exceptions that might occur.
