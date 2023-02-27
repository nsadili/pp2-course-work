import pp2.week05.geometry.Point;
import pp2.week05.geometry.Segment;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3,5); // we can add int to float but cannot add float to int!!!

        p1.translate(2,-1);
        p2.translate(5,2);

        Segment s1 = new Segment(p1, p2);
        Segment s2=new Segment(1,2,5,13);
        System.out.printf("p1: (%f, %f) and p2: (%f, %f)\n", s.getP1().getX(), s.getP1().getY(), s.getP2().getX(), s.getP2().getY());



        //System.out.println(p1.x + ", " +p2.y );  // first it is not visible because they are private!
        System.out.println(p1.getX() + ", " +p1.getY() );  
        System.out.println(p2.getX() + ", " +p2.getY() );  //now it will be visible since we use encapsulation
        
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        
        System.out.println(s1.getSlope());
        System.out.println(s1.equals(s2));

        System.out.printf("p1: %.02f %.02f , p2: %.02f %.02f\n",s1.getP1().getX(),s1.getP1().getY(),s1.getP2().getX(),s1.getP2().getY());
        System.out.println("y= " + s2.getSlope() +"x + "+s2.getIntercept());

        System.out.println(s2.isOnLine(new Point(1f, 3f)));

        System.out.println(s1.isOnSegment(p2));

    }
}
