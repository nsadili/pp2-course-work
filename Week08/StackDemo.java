package Week08;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> x = new Stack<Integer>();

        x.add(0);
        x.remove(0);
        System.out.println(x.toString());

        x.push(0);
        x.push(2);
        System.out.println(x.peek());

        x.pop();

        System.out.println(x.peek());
    }
}