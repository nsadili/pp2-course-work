public class Main3 {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);  // StackOverflowException will be thrown here
        } catch (StackOverflowException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());  // StackUnderflowException will be thrown here
        } catch (StackUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
