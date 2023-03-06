package Week06.Ex4;

public class Main {
    public static void main(String[] args) {
        Object r1 = new Rectangle(5, 10);
        Object r2 = new Rectangle(10, 10);
        Object r3 = new Square(10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r2.equals(r3));
        
    }
}
