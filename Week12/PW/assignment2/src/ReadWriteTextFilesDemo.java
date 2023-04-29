import java.io.*;

public class ReadWriteTextFilesDemo {

    public static void main(String[] args) {
        String filePath = "test.txt";
        String content = "Hello, world!\nThis is a test file.";

        try {
            FileWriter fw = new FileWriter(filePath);
            fw.write(content);
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(filePath);
            int ch;
            String fileContent = "";
            while ((ch = fr.read()) != -1) {
                fileContent += (char) ch;
            }
            fr.close();
            System.out.println("File content (read() method):\n" + fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(filePath);
            char[] buffer = new char[1024];
            int length;
            String fileContent = "";
            while ((length = fr.read(buffer)) > 0) {
                fileContent += new String(buffer, 0, length);
            }
            fr.close();
            System.out.println("File content (read(char[]) method):\n" + fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
