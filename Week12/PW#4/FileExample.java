import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
  public static void main(String[] args) {
    try {
      FileWriter writer = new FileWriter("output.txt");
      writer.write("This is some text to write to the file.");
      writer.close();
      System.out.println("Text written to file successfully!");
    } catch (IOException e) {
      System.out.println("An error occurred while writing to the file.");
      e.printStackTrace();
    }
  }
}
