package Week3;
import Week3.geometry.Point;
import Week3.geometry.Segment;


public class Main {
    public static void main(String args[]){
        Point p1 = new Point();
        // p1- reference to the object
        Point p2 = new Point(3, 5);
        System.out.println(p1.getX()+" "+p1.getY());
        System.out.println(p2.getX()+" "+p2.getY());

        p1.translate(0,0);
        p2.translate(2,4);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));

        Segment s = new Segment(p1, p2);
        System.out.printf("p1: (%.2f, %.2f) and p2: (%.2f, %.2f)\n", 
                        s.getP1().getX(), s.getP1().getY(),
                        s.getP2().getX(), s.getP2().getY());

    }
}
