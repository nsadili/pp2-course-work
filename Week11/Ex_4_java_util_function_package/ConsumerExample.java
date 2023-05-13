import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = str -> System.out.println(str);
        printer.accept("Hello, World!");
    }
}
