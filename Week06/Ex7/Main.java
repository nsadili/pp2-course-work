package Week06.Ex7;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3.0, 4.0, "red", true);

        System.out.println(r.toString());
        System.out.println("The perimeter of Rectangle: " + r.getPerimeter());
        System.out.println("The area of Rectangle: " + r.getArea());

        r.resize(100);

        System.out.println("New values: ");
        System.out.println("Width: " + r.getWidth());
        System.out.println("Length: " + r.getLength());

        Square s = new Square(5, "blue", false);
        System.out.println(s.toString());
        System.out.println("The perimeter of Square: " + s.getPerimeter());
        System.out.println("The area of Square: " + s.getArea());

        s.resize(200);

        System.out.println("New values: ");
        System.out.println("Width: " + s.getWidth());
        System.out.println("Length: " + s.getLength());

        Circle c = new Circle(2, "green", false);

        System.out.println(c.toString());
        System.out.println("The perimeter of Circle: " + c.getPerimeter());
        System.out.println("The area of Circle: " + c.getArea());

        c.resize(400);

        System.out.println("New values: ");
        System.out.println("Radius: " + c.getRadius());

    }
}
