import java.util.Arrays;

public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(2, 5);
        Point p2 = (Point) p1.clone();
        Point p3 = new Point(10, 13);

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

        Object[] shapes=new Object[3];
        shapes[0]=p1;
        shapes[1]=s1;
        shapes[2]=c1;
        System.out.println("Shape array default: "+ Arrays.toString(shapes));
        moveShapes(shapes, "up", 3);
        System.out.println("Shape array moved to: "+ Arrays.toString(shapes));
    }
    
    public static void moveShapes (Object[] shapes, String dir, int n){
        for (int i=0; i<shapes.length; i++){
            if (shapes[i] instanceof Point){
                Point p = (Point) shapes[i];
                switch (dir) {
                    case "up": p.moveUp(n);
                    break;
                    case "down": p.moveDown(n);
                    break;
                    case "left": p.moveLeft(n);
                    break;
                    case "right": p.moveRight(n);
                    break;
                    default: System.out.println("Please provide a valid direction!");
                }
                shapes[i]=p;
            }
            else if (shapes[i] instanceof Segment){
                Segment s = (Segment) shapes[i];
                switch (dir) {
                    case "up": s.moveUp(n);
                    break;
                    case "down": s.moveDown(n);
                    break;
                    case "left": s.moveLeft(n);
                    break;
                    case "right": s.moveRight(n);
                    break;
                    default: System.out.println("Please provide a valid direction!");
                }
                shapes[i]=s;
            }
            else if (shapes[i] instanceof Circle){
                Circle c = (Circle) shapes[i];
                switch (dir) {
                    case "up": c.moveUp(n);
                    break;
                    case "down": c.moveDown(n);
                    break;
                    case "left": c.moveLeft(n);
                    break;
                    case "right": c.moveRight(n);
                    break;
                    default: System.out.println("Please provide a valid direction!");
                }
                shapes[i]=c;
            }
            else {
                System.out.println("Please provide a valid input!");
            }
        }
    }
}
