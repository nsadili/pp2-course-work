package Week08;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.add(5);
        s.remove(0);
        System.out.println(s.toString());



        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());

        s.pop();

        System.out.println(s.peek());
    }
}