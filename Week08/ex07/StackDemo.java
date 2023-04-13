package Week08.ex07;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.add(5);
        s.add(10);

        s.remove(0);
        System.out.println(s.peek());

        s.push(0);
        s.push(1);
        s.push(2);
        System.out.println(s.peek());

        s.pop();

        System.out.println(s.peek());


        System.out.println(s.isEmpty());
    }
}