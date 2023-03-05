package EX;

public class TestrectAndSquare {
    public static void main(String args[]) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);
        // System.out.println(((Square)s1).set(4,6));
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        Object r4 = new Rectangle(5,10);
        Object s2 = new Rectangle(15,15);
        Object s3 = new Square(15);
        System.out.println("Objects are identical"+r4.equals(s2));
        System.out.println("Objects are identical"+r4.equals(s3));
        System.out.println("Objects are identical"+s2.equals(s3));
        
        Rectangle copyr1 = (Rectangle) r1.clone();
        // copyr1.set(5, 3);
        //When it is protected it can be accesed only from the same folder or from child class.
        System.out.println(r1.equals(copyr1));
        System.out.println(r1 == copyr1);
    }
}