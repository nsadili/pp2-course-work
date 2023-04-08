public class TestStackEnhanced {
    public static void main(String[] args) {
        StackEnhanced<Double> s1= new StackEnhanced(20);
        s1.push(5.4);
        s1.push(3.2);
        s1.push(2.4);
        s1.push(24.7);
        s1.push(1.1);
        s1.push(9.9);
        System.out.println("Is Stack empty? "+ s1.isEmpty());
        s1.printStack();
        System.out.println(s1.pop());
        System.out.println(s1.peek());
        StackEnhanced<Integer> s2= new StackEnhanced(30);
        s2.push(5);
        s2.push(3);
        s2.push(2);
        s2.push(2);
        s2.push(1);
        s2.push(9);
        s2.printStack();;
        
    }
}
