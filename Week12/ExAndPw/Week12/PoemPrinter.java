
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class PoemPrinter {
    public static void main(String args[]) {
        readLines("Week12/Resources/ex1/poem.txt");
    }

    static void readLines(String path) {
        File file = new File(path);
        try (FileReader fr = new FileReader(path, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(fr);
                
                BufferedWriter bw = new BufferedWriter(
                    new FileWriter(new File(file.getParent(),"poem-copied.txt"),StandardCharsets.UTF_8))){
                String str="";
            while ((str = br.readLine()) != null)
                // System.out.println(str);
                bw.write(str+"\n");
        } catch (IOException ex) {
            System.out.println("Reading a text file: " + ex);
        }
    }

}
//The advantage of wrapping one stream object in another is that it allows for more efficient and flexible handling of data. The BufferedReader class adds buffering capabilities to the FileReader class, which improves performance when reading large files. Similarly, the BufferedWriter class can be used to add buffering capabilities to a FileWriter object, which can improve the performance of writing large files. Additionally, wrapping streams can add new functionality, such as transforming data or handling errors, depending on the types of streams used.
