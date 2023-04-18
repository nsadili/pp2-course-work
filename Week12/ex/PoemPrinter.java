import java.io.*;

class PoemPrinter {
    public static void main(String args[]) {
        try (FileReader fr = new FileReader("poem.txt");
                BufferedReader br = new BufferedReader(fr)) {
            String str = "";
            while ((str = br.readLine()) != null)
                System.out.println(str);
        } catch (IOException ex) {
            System.out.println("Reading a text file: " + ex);
        }
    }
}
