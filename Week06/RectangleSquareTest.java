package Week06;

public class RectangleSquareTest {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(15, 15);
        Rectangle r3 = new Square(15);

    
        System.out.println("Objects are identical: " + r1.equals(r2));
        System.out.println("Objects are identical: " + r1.equals(r1));
        System.out.println("Objects are identical: " + r2.equals(r3));
    }
}
