package Week12;
import java.io.*;

public class pw4 {
    private static final String FILEPATH = "Week12/example.txt";
    
    public static void main(String[] args) {
        String text = "Hello, world!";
        writeToFile(text);
        String content = readFromFile();
        System.out.println("Content read using read() method:");
        System.out.println(content);
        content = readFromFileChar();
        System.out.println("Content read using read(char[]) method:");
        System.out.println(content);
    }

    private static void writeToFile(String text) {
        try (FileWriter fw = new FileWriter(FILEPATH)) {
            fw.write(text);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }

    private static String readFromFile() {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(FILEPATH)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                sb.append((char) ch);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file.");
            e.printStackTrace();
        }
        return sb.toString();
    }

    private static String readFromFileChar() {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(FILEPATH);
             BufferedReader br = new BufferedReader(fr)) {
            char[] buf = new char[1024];
            int numCharsRead;
            while ((numCharsRead = br.read(buf)) != -1) {
                sb.append(buf, 0, numCharsRead);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file.");
            e.printStackTrace();
        }
        return sb.toString();
    }
}
