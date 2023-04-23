import java.io.*;

public class FileWriterExample {
    public static void main(String args[]) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("hello.txt");
            byte[] b = { 1, 1, 2, 3, 5, 8, 13, 21, 34 };
            fos.write(b, 2, 3);
        } catch (Exception ex) {
            System.out.println("Writing error happened: " + ex);
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException ex2) {
                System.out.println("Cannot close an output file");
            }
        }
    }
}
