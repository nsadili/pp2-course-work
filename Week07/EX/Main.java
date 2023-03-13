public class Main {
    public static void main(String[] args) {
    try {
        int result = Factorial.factorial(-2);
        System.out.println(result);
    } catch (IllegalArgumentException m) {
        System.out.println("Error: " + m.getMessage());
    }
}

}
