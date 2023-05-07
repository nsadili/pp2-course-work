package Week13.CountingWords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class B {
    public static void main(String[] args) {
        String fileName = "Week13/Resouces/A.txt";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { // for reading a file 
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\s+"); // to split lines into tokens we use split() method 
                for (String token : tokens) {
                    if (token.length() > 3) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The number of the words in one file " + wordCount);
    }
}

// The same Java program as in A.java just to count the number of words in a file without using concurrency
// Diffenrece from the previos one: it doesn't use any threads.