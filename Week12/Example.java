package Week12;

import java.io.FileOutputStream;

public class Example {
   public static void main(String[] args) {
      try {
         String message = "Hello, world!";
         byte[] messageBytes = message.getBytes();

         FileOutputStream fos = new FileOutputStream("output.txt");
         fos.write(messageBytes);
         fos.close();

         System.out.println("Message written to file.");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
