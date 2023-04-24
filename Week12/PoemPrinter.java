
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class PoemPrinter {
    public static void main(String args[]) {
        readLines("Week12/Resources/ex1/poem.txt");
    }

    static void readLines(String path) {
        try (FileReader fr = new FileReader(new File(path), Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(fr);
                
                BufferedWriter bw = new BufferedWriter(new FileWriter("Week12/Resources/ex1/output.txt", StandardCharsets.UTF_8))) {
                    //By wrapping a FileReader in a BufferedReader 
                    //the code is able to take advantage of the 
                    //buffering capabilities of the BufferedReader
                    //resulting in faster reading of the input file
                    String str = "";
            while ((str = br.readLine()) != null)
                System.out.println(str);
                bw.write(str);
        } catch (IOException ex) {
            System.out.println("Reading a text file: " + ex);
        }
    }

}