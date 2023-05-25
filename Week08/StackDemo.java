package Week08;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.add(0);
        s.remove(0);
        System.out.println(s.toString());


        s.push(0);
        s.push(1);
        s.push(2);
        System.out.println(s.peek());

        s.pop();

        System.out.println(s.peek());
    }
}
