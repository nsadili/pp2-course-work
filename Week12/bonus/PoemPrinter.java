package Week12.bonus;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class PoemPrinter {
    public static void main(String args[]) {
        readLines("Week12/bonus/poem_printer.txt");
    }

    static void readLines(String path) {
        File file = new File(path);
        try (FileReader fr = new FileReader(path, Charset.forName("UTF_16"));
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(
                    new FileWriter(new File(file.getParent(),"poem_printer_copied.txt"),StandardCharsets.UTF_16))){
                String str="";
            while ((str = br.readLine()) != null)
                bw.write(str+"\n");
        } catch (IOException ex) {
            System.out.println("Reading a texting file: " + ex);
        }
    }
}