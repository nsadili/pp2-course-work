import Ex04.Rectangle;
import Ex04.Square;
public class TestEx04 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1= new Rectangle(5,10);
        Rectangle r2= new Rectangle(15,10);
        Rectangle r3= new Rectangle(5, 10);
        Object s1= new Square(3);
        Rectangle rCopy= (Rectangle) r1.clone();
        System.out.println(r1.equals(rCopy));
        System.out.println(r1==rCopy);
        
    }
    
}
