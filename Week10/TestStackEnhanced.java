package Week10;

public class TestStackEnhanced {
    public static void main(String[] args) {
        StackEnhanced<Double> s1= new StackEnhanced(20);
        s1.push(2.5);
        s1.push(3.4);
        s1.push(2.1);
        s1.push(15.3);
        s1.push(2.3);
        s1.push(4.4);
        System.out.println("Is Stack Empty? "+ s1.isEmpty());
        s1.printStack();
        System.out.println(s1.pop());
        System.out.println(s1.peek());
        StackEnhanced<Integer> s2= new StackEnhanced(30);
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        s2.push(5);
        s2.push(6);
        s2.printStack();;
        
    }
}