package Ex5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class PoemPrinter {
    public static void main(String args[]) {
        readLines("/Users/raqli/Desktop/pp2-course-work/Week12/Ex5/poem.txt");
    }

    static void readLines(String path) {
        try (FileReader fr = new FileReader(new File(path), Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(fr);
                
                BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/raqli/Desktop/pp2-course-work/Week12/Ex5/output.txt", StandardCharsets.UTF_8))) {
            String str = "";
            while ((str = br.readLine()) != null)
                //System.out.println(str);
                bw.write(str);
        } catch (IOException ex) {
            System.out.println("Reading a text file: " + ex);
        }
    }

}

// The FileReader object reads characters from the file, but reading data character by character can be inefficient. 
// Wrapping one stream object in another provides various benefits. 
// For example, it can increase the efficiency of I/O operations by buffering the input or output, it can provide additional functionality like character encoding conversion, and it can improve code readability and maintainability by separating different concerns into different objects.
