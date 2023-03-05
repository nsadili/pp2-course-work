
public class TestRectangleAndSquare {
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(5, 5);
        Rectangle r3 = new Rectangle(2, 5);
        
        Square s1 = new Square(2);
        // System.out.println(r1.equals(r3));
        // System.out.println(s1.equals(r2));
        // System.out.println(r2.equals(s1));

        // Rectangle rCopy = (Rectangle) r1.clone();
        // rCopy.set(2, 5);
        // System.out.println(r1.equals(rCopy));
        // System.out.println(r1 == rCopy);

        System.out.println(r1.resize());
        System.out.println(r2.resize());
        System.out.println(r3.resize());
        System.out.println(s1.resize());
    }

}
