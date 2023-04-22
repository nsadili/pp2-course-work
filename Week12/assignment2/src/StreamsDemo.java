import java.io.*;

public class StreamsDemo {

    public static void main(String[] args) throws IOException {

        String data = "This is a demo string for a Principles of Programming 2 class's exercise";
        String filename = "stringfile.txt";

        FileOutputStream fos = new FileOutputStream(filename);
        byte[] dataBytes = data.getBytes();
        fos.write(dataBytes);
        fos.close();

        FileInputStream fis = new FileInputStream(filename);
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fis.read()) != -1) {
            sb.append((char) ch);
        }
        fis.close();
        String fileContent1 = sb.toString();
        System.out.println("\nOutput using read() method:\n");
        System.out.println(fileContent1);

        fis = new FileInputStream(filename);
        sb = new StringBuilder();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) != -1) {
            sb.append(new String(buffer, 0, length));
        }
        fis.close();
        String fileContent2 = sb.toString();
        System.out.println("\nOutput using read(byte[]) method:\n");
        System.out.println(fileContent2);
        System.out.println("");

        // Differences between the two read methods:
        // 1. The read() method reads a single
        // byte at a time, while the read(byte[]) method reads multiple bytes at once.
        // 2. The read() method returns the integer value of the byte read, while the
        // read(byte[]) method returns the number of bytes read.

    }
}
