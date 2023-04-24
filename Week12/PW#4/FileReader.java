import java.io.FileReader;
import java.io.IOException;

public class FileExample {
  public static void main(String[] args) {
    try {
      FileReader reader = new FileReader("output.txt");
      int character;
      String content = "";

       while ((character = reader.read()) != -1) {
        content += (char) character;
      }
      System.out.println("File content using read() method:");
      System.out.println(content);

       reader.close();
      reader = new FileReader("output.txt");

       char[] buffer = new char[1024];
      int length;
      content = "";
      while ((length = reader.read(buffer)) != -1) {
        content += new String(buffer, 0, length);
      }
      System.out.println("File content using read(char[]) method:");
      System.out.println(content);

      reader.close();
    } catch (IOException e) {
      System.out.println("An error occurred while reading the file.");
      e.printStackTrace();
    }
  }
}
