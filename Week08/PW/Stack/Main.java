import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());  // Output: 30
        System.out.println(stack.peek()); // Output: 20
        System.out.println(stack.pop());  // Output: 20
        System.out.println(stack.isEmpty()); // Output: false
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }
}
