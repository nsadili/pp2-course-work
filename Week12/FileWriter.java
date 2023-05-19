import java.io.IOException;

public class FileWriter {
    public FileWriter(String filePath) {
    }

    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";
        
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            String textToWrite = "This is some text that will be written to the file.";
            fileWriter.write(textToWrite);
            System.out.println("Text successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
