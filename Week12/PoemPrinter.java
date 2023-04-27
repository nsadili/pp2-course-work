package Week12;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PoemPrinter {

   public static void main(String[] args) {
   
      try {
         // Create a FileReader object to read the text file
         FileReader fileReader = new FileReader("poem.txt");
         
         // Wrap the FileReader in a BufferedReader for efficient reading
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         
         String line;
         
         // Read the text file line by line and print each line to the console
         while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
         }
         
         // Close the BufferedReader and FileReader objects to release system resources
         bufferedReader.close();
         fileReader.close();
         
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
