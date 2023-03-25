package Week08.Ex7;

public class Main {
    public static void main(String[] args) {
        LinkedListStack<String> stack = new LinkedListStack<>();

        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");

        System.out.println(stack.size());

        System.out.println(stack.pop()); 

        System.out.println(stack.peek()); 

        stack.clear();

        System.out.println(stack.isEmpty());

    }
}
