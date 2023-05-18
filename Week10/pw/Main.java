public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Size of the stack: " + stack.size());
        System.out.println("Top element of the stack: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        System.out.println("Size of the stack after popping: " + stack.size());
    }
}
