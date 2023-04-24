
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class PoemPrinter {
    public static void main(String args[]) {
        readLines("Resources/ex1/poem.txt");
    }

    static void readLines(String path) {
        File file = new File(path);
        try (FileReader fr = new FileReader(file, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(fr);

                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(new File(file.getParent(), "output.txt"), StandardCharsets.UTF_8))) {
            String str = "";
            while ((str = br.readLine()) != null)

                // System.out.println(str);
                bw.write(str + "\n");
        } catch (IOException ex) {
            System.out.println("Reading a text file: " + ex);
        }
    }

}