package week12;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class PoemPrinter {
    public static void main(String args[]) {
        readLines("Week12/Resources/poem1.txt");
    }

    static void readLines(String path) {
        File file = new File(path);
        try (FileReader fr = new FileReader(path, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(fr);
                
                BufferedWriter bw = new BufferedWriter(
                    new FileWriter(new File(file.getParent(),"copy.txt"),StandardCharsets.UTF_8))){
                String str="";
            while ((str = br.readLine()) != null)
                // System.out.println(str);
                bw.write(str+"\n");
        } catch (IOException ex) {
            System.out.println("Reading a text file" + ex);
        }
    }
//the comp problem
}

