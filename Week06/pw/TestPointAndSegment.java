public class TestPointAndSegment {
    
    public static void main(String[] args) throws CloneNotSupportedException {
       

        Point p1 = new Point(5, 7);
        Point p2 = new Point(2, 5);
        p1.moveUp(6);
        Circle c1 = new Circle(new Point(0, 0), 1.0);
         c1.moveDown();

        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}