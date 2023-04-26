import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class PoemPrinter {
    public static void main(String args[]) {
        readLines("Resources/ex1/poem.txt");
    }

    static void readLines(String path) {
        try (FileReader fr = new FileReader(new File(path), Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(fr);
                
                BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", StandardCharsets.UTF_8))) {
            String str = "";
            while ((str = br.readLine()) != null)
                // System.out.println(str);
                bw.write(str);
        } catch (IOException ex) {
            System.out.println("Reading a text file: " + ex);
        }
    }

}
/*
 * b. The goal of enclosing a FileReader object in a BufferedReader in the
 * PoemPrinter class is to increase file reading performance. BufferedReader
 * reads data from a file or stream and buffers it in memory so that it can read
 * numerous characters at once rather than one at a time. This improves the
 * efficiency of the reading process, especially when reading huge files.
 * 
 * c. The benefit of wrapping one stream object in another is that we can add
 * new functionality to the stream. In this scenario, the BufferedReader object
 * provides buffering functionality to the FileReader object, making the reading
 * process more efficient. Similarly, in the PoemPrinter class, the
 * BufferedWriter adds the functionality of buffering and writing to a file to
 * the FileWriter object. Wrapping streams in other streams can also add
 * additional features such as compression, encryption, and filtering. This
 * makes it easier to add new functionality to existing streams without having
 * to change the code that uses them.
 */