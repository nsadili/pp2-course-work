import pp2.week03.geometry.Point;
import pp2.week03.geometry.Segment;

public class Main {
    public static void main(String[] args) {
        
      Point p1 = new Point();
      Point p2 = new Point(3,5);

      //p1.translate(2,1);
      //p2.translate(5,2);

       //System.out.println(p1.getx() + "," + p1.gety());
       //System.out.println(p2.getx() + "," + p2.gety());
    
       //System.out.println(p1.distance(p2));    
    
        Segment s = new Segment(p1 , p2);   
        System.out.printf(
            "p1: (%.2f, %.2f) and p2: (%.2f, %.2f)\n",
            s.getP1().getx(),s.getP1().gety(),
            s.getP2().getx(),s.getP2().gety()
        );
    }
    
}
