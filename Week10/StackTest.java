public class StackTest{

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            System.out.println(stack.pop()); // Output: 5
            System.out.println(stack.peek()); // Output: 4

            stack.push(6);
        } catch (StackOverflowException e) {
            System.out.println("Stack overflow!");
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        try {
            System.out.println(stack.peek());
        } catch (StackUnderflowException e) {
            System.out.println("Stack underflow!");
        }

    }
}
