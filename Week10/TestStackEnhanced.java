package Week10;

public class TestStackEnhanced {
    public static void main(String[] args) {
        StackEnhanced<Double> stack= new StackEnhanced(20);
        stack.push(3.2);
        stack.push(1.9);
        stack.push(7.8);
        stack.push(2.5);
        stack.push(42.6);
        stack.push(11.9);
        System.out.println("Is Stack empty? "+ stack.isEmpty());
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        StackEnhanced<Integer> s2= new StackEnhanced(30);
        s2.push(3);
        s2.push(1);
        s2.push(6);
        s2.push(9);
        s2.push(7);
        s2.push(8);
        s2.printStack();;

    }
}
