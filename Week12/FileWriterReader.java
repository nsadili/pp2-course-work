package Week12;
import java.io.*;

public class FileWriterReader {
   public static void main(String[] args) {
    String fileName = "path/to/file.txt";
    String fileContent = " some text  will be written to the file.";

      try {
         FileWriter writer = new FileWriter(fileName);
         writer.write(fileContent);
         writer.close();
         System.out.println("Successfully");
      } catch (IOException e) {
         System.out.println("Error");
         e.printStackTrace();
      }

      try {
         FileReader reader = new FileReader(fileName);
         char[] buffer = new char[1024];
         StringBuilder stringBuilder = new StringBuilder();

         int len;
         while ((len = reader.read(buffer)) != -1) {
            stringBuilder.append(buffer, 0, len);
         }

         reader.close();
         String fileData = stringBuilder.toString();
         System.out.println("File content: " + fileData);
      } catch (IOException e) {
         System.out.println("Error ");
         e.printStackTrace();
      }
   }
}


