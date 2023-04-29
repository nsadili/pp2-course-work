package Week12;

import java.io.FileWriter;
import java.io.IOException;

public static void writeToFile(String text, String filename) throws IOException {
   FileWriter writer = new FileWriter(filename);
   writer.write(text);
   writer.close();
}

import java.io.FileReader;
import java.io.IOException;

public static String readFromFile(String filename) throws IOException {
   FileReader reader = new FileReader(filename);
   StringBuilder sb = new StringBuilder();
   int ch = reader.read();
   while (ch != -1) {
      sb.append((char)ch);
      ch = reader.read();
   }
   reader.close();
   return sb.toString();
}

import java.io.FileReader;
import java.io.IOException;

public static String readFromFile(String filename) throws IOException {
   FileReader reader = new FileReader(filename);
   StringBuilder sb = new StringBuilder();
   int ch;
   while ((ch = reader.read()) != -1) {
      sb.append((char)ch);
   }
   reader.close();
   return sb.toString();
}