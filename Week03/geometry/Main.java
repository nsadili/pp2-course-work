package Week03.geometry;

public class Main{
    public static void main(String [] args)
    {
        Point p1 = new Point();
        Point p2 = new Point(2, 4);

        Segment s = new Segment(p1, p2); 

        System.out.printf("p1: (%f , %f) and p2: (%f , %f) \n", s.getP1().getX(), s.getP1().getY(), s.getP2().getX(), s.getP2().getY());

        p1.translate(1, -2);
        p2.translate(6, 3);

        System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p2.getX() + " " +p2.getY());
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        
    }
}