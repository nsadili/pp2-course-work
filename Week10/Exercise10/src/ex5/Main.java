package ex5;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>(4);

        try {
            s1.peek();
        } catch (StackIsEmptyError e) {
            System.out.println(e.getMessage());
        }

        s1.push(5);
        s1.push(7);

        s1.printStack();

        try {
            System.out.println(s1.pop());
            System.out.println(s1.pop());
            System.out.println(s1.pop());
        } catch (StackIsEmptyError e) {
            System.out.println(e.getMessage());
        }

        try {
            s1.push(4);
            s1.push(6);
            s1.push(0);
            s1.push(13);
            s1.push(68);
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }

        s1.printStack();
    }
}
