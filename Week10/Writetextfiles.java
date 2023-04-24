import java.io.FileReader;
import java.io.IOException;

public class Writetextfiles {
  public static void main(String[] args) {
    try {
      FileReader myReader = new FileReader("input.txt");
      char[] buffer = new char[1024];
      int length = myReader.read(buffer);
      while (length != -1) {
        System.out.print(new String(buffer, 0, length));
        length = myReader.read(buffer);
      }
      myReader.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
