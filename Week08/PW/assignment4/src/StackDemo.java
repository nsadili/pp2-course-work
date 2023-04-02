import java.util.LinkedList;

public class StackDemo {

    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(3);
        stack.push(7);
        stack.push(1);

        System.out.println("Stack contents: " + stack);

        int topElement = stack.pop();
        System.out.println("Popped element: " + topElement);

        System.out.println("Stack contents: " + stack);

        int peekElement = stack.peek();
        System.out.println("Top element: " + peekElement);

        System.out.println("Stack contents: " + stack);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        stack.addLast(5);
        System.out.println("Stack contents after adding an element to the bottom: " + stack);

        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}