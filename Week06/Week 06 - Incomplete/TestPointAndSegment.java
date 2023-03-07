public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(2, 5);
        Point p3 = new Point(10, 13);

        Point p2 = (Point) p1.clone();

        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println();

        Segment s1 = new Segment(p1, p3);
        Segment s2 = (Segment) s1.clone();
        
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.getP1()==s2.getP1());

        System.out.println();

        System.out.println("Point default: "+p1.getX() + ", " + p1.getY());
        p1.moveUp(1);
        System.out.println("Point moved to: "+p1.getX() + ", " + p1.getY());
        p1.moveRight(1);
        System.out.println("Point moved to: "+p1.getX() + ", " + p1.getY());
        p1.moveDown(1);
        System.out.println("Point moved to: "+p1.getX() + ", " + p1.getY());
        p1.moveLeft(1);
        System.out.println("Point moved to: "+p1.getX() + ", " + p1.getY());

        System.out.println();

        System.out.println("Segment default: "+s1.toString());
        s1.moveUp(1);
        System.out.println("Segment moved to: "+s1.toString());
        s1.moveRight(1);
        System.out.println("Segment moved to: "+s1.toString());
        s1.moveDown(1);
        System.out.println("Segment moved to: "+s1.toString());
        s1.moveLeft(1);
        System.out.println("Segment moved to: "+s1.toString());

        System.out.println();
        
        Circle c1 = new Circle(p1, 5);
        Circle c2 = new Circle(p3, 7);

        System.out.println("Circle default: "+c1.toString());
        c1.moveUp(1);
        System.out.println("Circle moved to: "+c1.toString());
        c1.moveRight(1);
        System.out.println("Circle moved to: "+c1.toString());
        c1.moveDown(1);
        System.out.println("Circle moved to: "+c1.toString());
        c1.moveLeft(1);
        System.out.println("Circle moved to: "+c1.toString());






    }
}
