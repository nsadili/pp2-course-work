package week12;

import java.io.*;

public class StreamsDemo {

    public static void main(String[] args) {

        String data = "some data";

        try (FileOutputStream fos = new FileOutputStream("data.txt")) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("error writing to file.");
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("data")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println("\n");
        } catch (IOException e) {
            System.out.println("error reading from file");
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("data")) {

            System.out.println("reading file with read() method: ");
            int content;
            StringBuilder sb = new StringBuilder();
            while ((content = fis.read()) != -1) {
                sb.append((char) content);
            }
            System.out.println(sb.toString() + "\n");

            System.out.println("reading file with read(byte[]) method: ");
            byte[] buffer = new byte[1024];
            sb = new StringBuilder();
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                sb.append(new String(buffer, 0, bytesRead));
            }
            System.out.println(sb.toString());

            System.out.println("\nThe read(byte[]) method is more " + "efficient than the read() method ");
        } catch (IOException e) {
            System.out.println("error reading from file.");
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("data")) {
            byte[] buffer = new byte[1024];
            int bytesRead = fis.read(buffer);
            String content = new String(buffer, 0, bytesRead);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("error reading from file.");
            e.printStackTrace();
        }
    }
}
