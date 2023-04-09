public class Main {

    public static void main(String[] args) {
        StackEnhanced<Integer> stack = new StackEnhanced<>(5);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("Peek: " + stack.peek());
            stack.push(4);
            stack.push(5);
            System.out.println("Size: " + stack.size());
            stack.push(6);
        } catch (Exception ex) {
            System.out.println("Stack is full.");
        }

        try {
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
        } catch (Exception ex) {
            System.out.println("Stack is empty.");
        }
    }

}
