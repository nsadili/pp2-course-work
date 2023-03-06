package MoveblaInterface;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println(p); 
        p.moveUp();
        System.out.println(p); 

        Segment s = new Segment(new Point(1, 2), new Point(4, 5));
        System.out.println(s);
        s.moveRight();
        System.out.println(s); 

        Circle c = new Circle(new Point(0, 0), 5);
        System.out.println(c); 
        c.moveDown();
        System.out.println(c); 
    }
}
