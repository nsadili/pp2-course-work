package Week10.ex5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs, "Hello", "World");
        Stack<String> stack = new Stack<>(strs);
        stack.push("123");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.pop());
    }
}
