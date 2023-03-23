import java.util.LinkedList;

public class Stack {
    public LinkedList<Integer> stack = new LinkedList<>();

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("top element: " + stack.peek());

    }

    public void push(int num) {
        stack.addLast(num);
    }

    public int peek() {
        return stack.getFirst();
    }

}
