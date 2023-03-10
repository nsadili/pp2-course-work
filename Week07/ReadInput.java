package Week07;

import java.io.IOException;

public class ReadInput {
    public static void main(String[] args) {
        try {
            System.out.print("Enter a character: ");
            int input = System.in.read();
            System.out.println("You entered: " + (char) input);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }

        // Alternatively, you can use 'throws' to handle the exception:
        /*try {
            readInput();
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }*/
    }

    // Method to read input using 'throws'
    /*public static void readInput() throws IOException {
        System.out.print("Enter a character: ");
        int input = System.in.read();
        System.out.println("You entered: " + (char) input);
    }*/
}

