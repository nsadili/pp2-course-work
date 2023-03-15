import java.io.IOException;

public class MyClass {
    public static void main(String[] args) {
        try {
            System.out.print("Enter a character: ");
            int ch = System.in.read();
            System.out.println("You entered: " + (char) ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
