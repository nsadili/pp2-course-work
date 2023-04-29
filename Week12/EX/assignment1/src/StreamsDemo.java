import java.io.*;

public class StreamsDemo {

    public static void main(String[] args) {
        String data = "This is a demo string to test file streams in Java.";

        try {
            FileOutputStream fos = new FileOutputStream("file.txt");
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("file.txt");
            StringBuilder sb = new StringBuilder();
            int ch;
            while ((ch = fis.read()) != -1) {
                sb.append((char) ch);
            }
            fis.close();
            String fileContent = sb.toString();
            System.out.println("File content using read() method: " + fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("file.txt");
            byte[] bytes = new byte[1024];
            int length = fis.read(bytes);
            fis.close();
            String fileContent = new String(bytes, 0, length);
            System.out.println("File content using read(byte[]) method: " + fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Difference between read() and read(byte[]) methods:");
        System.out.println(
                "read() method reads a single byte at a time from the file, while read(byte[]) method reads multiple bytes at once into a byte array.");
        System.out.println(
                "read() method returns an integer value representing the byte read, while read(byte[]) method returns the number of bytes read into the array.");
        System.out.println(
                "read(byte[]) method is more efficient for reading large files because it reads multiple bytes at once.");
    }
}
