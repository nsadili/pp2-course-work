package pp2.week03.geometry;
import pp2.week03.geometry.Point;
import pp2.week03.geometry.Segment;

public class Main {
    
    public static void main(String[] args) {
        Point p1= new Point();
        Point p2= new Point(3,5);

        Segment s= new Segment(p1,p2);

        System.out.printf("p1.x= %f, p2.y= %f\n",p1.getX(),p2.getY());
        System.out.printf("s.p1= %f\n",s.getP1().getX());
        p1.translate(1, -2);
        s.translate(2, 3);
        System.out.printf("%f %f %f %f\n",p1.getX(),p1.getY(),p2.getX(),p2.getY());
        System.out.printf("%f %f\n",p1.distance(p2),s.length());
        System.out.printf("%b\n",p1.equals(p2));
        System.out.printf("%b\n",s.IsOnLine(p2));

    }
}
