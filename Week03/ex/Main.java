import pp2.week03.geometry.Point;
import pp2.week03.geometry.Segment;
public class Main {
    public static void main(String[] args){
        Point p1= new Point();
        Point p2= new Point(3,5);
        p1.translate(2,-1);
        p2.translate(5,2);
        Segment s1= new Segment(p1,p2);
        Segment s2= new Segment(1,2,3,4);




        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p2.equals(p1));

        System.out.println("Segment 1 : (" + s1.getP1().getX()+ ", " + s1.getP1().getY()+")" + ", " + "("+ s1.getP2().getX()+ ", " + s1.getP2().getY()+")");

        System.out.println("Segment 2 : (" + s2.getP1().getX()+ ", " + s2.getP1().getY()+")" + ", " + "("+ s2.getP2().getX()+ ", " + s2.getP2().getY()+")");
         
        s1.translate(1.0f, 2.0f);
         
        System.out.println("Translated Segment 1 : (" + s1.getP1().getX()+ ", " + s1.getP1().getY()+")" + ", " + "("+ s1.getP2().getX()+ ", " + s1.getP2().getY()+")");
        System.out.println("Length of Segment 1:" + s1.length());
        System.out.println("Are Segment 1 and Segment 2 equal?"+ s1.equals(s2));
        System.out.println("Slope of Segment 1 :" +s1.getSlope());
        System.out.println("Intercept of Segment 1:" +s1.getIntercept());


        Point p3 = new Point(2.0f, 3.0f);
        System.out.println("Is Point 3 on line of Segment 1? :"+ s1.isOnline(p3));
        System.out.println("Is Point 3 on Segment 1? :"+ s1.IsOnSegment(p3));



        }
}
