import java.io.IOException;

public class ReadCharFromConsole {
    public static void main(String[] args) {
        try {
            System.out.print("Enter a character: ");
            char symbol = (char) System.in.read();
            System.out.println("You entered: " + symbol);
        } catch (IOException e) {
            System.err.println("Error reading from input stream.");
            e.printStackTrace();
        }
    }
}
