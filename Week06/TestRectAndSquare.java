package Week06;

public class TestRectAndSquare {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(2,5);
        Rectangle r2 = new Rectangle(2,5);

        // Square s1 = new Square(3);
        Object s1 = new Square(3);
        
        Rectangle rCopy = (Rectangle) r1.clone();
        rCopy.set(5,5);

        System.out.println(r1.equals(rCopy));
        //System.out.println(r1 == rCopy);


        // Segment s2 = new Segment(2,3,5,7);



        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s1.equals(s2));
    }
}
