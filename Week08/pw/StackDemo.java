import java.util.LinkedList;

public class StackDemo {

    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();

        // Pushing elements onto the stack
        stack.push("ferrari");
        stack.push("porsche");
        stack.push("mercedes");

        // Peeking at the top element of the stack
        System.out.println("Top element: " + stack.peek());

        
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
