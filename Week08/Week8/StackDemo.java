package Week8;
import java.util.LinkedList;

public class StackDemo {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        
        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // Peek at the top element of the stack
        System.out.println("Top element of stack: " + stack.peek());
        
        // Pop elements off the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        
        // Push another element onto the stack
        stack.push(4);
        
        // Print the elements in the stack
        System.out.println("Elements in stack: " + stack);
    }
}

