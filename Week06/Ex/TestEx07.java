import Ex07.Rectangle;
import Ex07.Shape;
import Ex07.Square;
import Ex07.Circle;
public class TestEx07 {
    public static void main(String[] args) {
     Rectangle r = new Rectangle(3.0, 4.0, "red", true);
     System.out.println(r.toString());
     System.out.println("The perimeter of Rectangle is: " + r.getPerimeter());
     System.out.println("The area of Rectangle is: "+ r.getArea());
     r.resize(100);
     System.out.println("Updated values: ");
     System.out.println("Width is: "+r.getWidth());
     System.out.println("Length is: "+r.getLength());

     Square s= new Square(5, "blue", false);
     System.out.println(s.toString());
     System.out.println("The perimeter of Square is: " + s.getPerimeter());
     System.out.println("The area of Square is: "+ s.getArea());
     s.resize(200);
     System.out.println("Updated values: ");
     System.out.println("Width is: "+s.getWidth());
     System.out.println("Length is: "+s.getLength());

     Circle c= new Circle(2, "green", false);
     System.out.println(c.toString());
     System.out.println("The perimeter of Circle is: " + c.getPerimeter());
     System.out.println("The area of Circle is: "+ c.getArea());
     c.resize(400);
     System.out.println("Updated values: ");
     System.out.println("Radius is: "+c.getRadius());

    
     
  
    
    }
}
