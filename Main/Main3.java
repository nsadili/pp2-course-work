package Main;

public class Main3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");  // Valid: Modifying the object
        System.out.println(sb);

        sb = new StringBuilder();  // Error: Cannot reassign the final variable
        System.out.println(sb);
    }
}