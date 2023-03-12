package Week06;

public class TestRectAndSquare {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(2,5);
        Rectangle r2 = new Rectangle(2,5);

        
        Object s1 = new Square(3);
        
        Rectangle rCopy = (Rectangle) r1.clone();
        rCopy.set(5,5);

        System.out.println(r1.equals(rCopy));
        
    }
}
