public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("!");

        stack.push("World");

        stack.push("Hello");

        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.isEmpty());
    }
}
