package Week08;
import java.util.Stack;
//import Week07.Stack;
public class StackWeek08{
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.push(3);
        myStack.push(5);
        myStack.push(7);
        myStack.push(10);
        myStack.push(100);
        System.out.println(myStack.peek());

        myStack.peek();
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.toString());

    }
}
