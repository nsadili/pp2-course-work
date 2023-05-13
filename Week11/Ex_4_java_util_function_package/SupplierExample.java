import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Hello, World!";
        String result = message.get();
        System.out.println(result);
    }
}
