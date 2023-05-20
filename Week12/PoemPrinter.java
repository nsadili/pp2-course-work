package Week12;

import java.io.*;

class PoemPrinter {
    public static void main(String[] args) {
        String filePath = "Week12/Resources/ex1/poem.txt";
        String outputPath = "Week12/Resources/ex1/poem-copied.txt";
        readAndWriteFile(filePath, outputPath);
    }

    static void readAndWriteFile(String inputPath, String outputPath) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}