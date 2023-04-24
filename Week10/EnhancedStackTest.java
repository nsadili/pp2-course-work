package Week10;

public class EnhancedStackTest {
    public static void main(String[] args) {
        // Example with integer elements
        EnhancedStack<Integer> intStack = new EnhancedStack<>(5);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("Peek: " + intStack.peek()); // Prints: Peek: 3
        System.out.println("Pop: " + intStack.pop()); // Prints: Pop: 3

        // Example with string elements
        EnhancedStack<String> stringStack = new EnhancedStack<>(3);
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Peek: " + stringStack.peek()); // Prints: Peek: World
        System.out.println("Pop: " + stringStack.pop()); // Prints: Pop: World
    }
}

