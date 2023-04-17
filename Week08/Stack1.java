package Week08;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();

        stack1.add(0);
        stack1.remove(0);
        System.out.println(stack1.toString());



        stack1.push(0);
        stack1.push(1);
        stack1.push(2);
        System.out.println(stack1.peek());

        stack1.pop();

        System.out.println(stack1.peek());
    }
}
