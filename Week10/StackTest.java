package Week10;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>(10);
        s1.__print();
        s1.add("Rufat");
        s1.add("Nariman");
        s1.add("Shamil");
        s1.add("Arzum");
        s1.add("Maqa");
        s1.__print();
        System.out.println(s1.peek());
        s1.__print();
        System.out.println(s1.pop());
        s1.__print();
        System.out.println(s1.pop());
        s1.__print();

    }
}
