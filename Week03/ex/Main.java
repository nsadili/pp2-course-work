

import pp2.week03.geometry.Point;
import pp2.week03.geometry.Segment;

public class Main {
    
    public static void main(String[] args) {
        
        Point p1 = new Point(1,3);
        //p1.setX(2);
        //p1.setY(6);
        Point p2 = new Point(6,13);
        Point p3 = new Point(2,5);
        Point p4 = new Point(3,5);
        Segment s = new Segment(p1, p2);

        p3.translate(0,0);
        p4.translate(0,0);

        System.out.println("p1 x: " + p1.getX() + "," + "p1 y: " + p1.getY());
        System.out.println("p2 x: " + p2.getX() + "," + "p2 y: " + p2.getY());
        System.out.println("p3 x: " + p3.getX() + "," + "p3 y: " + p3.getY());
        System.out.println("p4 x: " + p4.getX() + "," + "p4 y: " + p4.getY());

        System.out.println("translated: " + p1.getX() + "," + p1.getY());
        System.out.println("translated: " + p2.getX() + "," + p2.getY());
        
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        System.out.println("Distance between p1 and p2: " + p2.distance(p1));
        
        System.out.println("Is p2 equal to p1: " + p1.equals(p2));
        System.out.println("Is p1 equal to p2: " + p2.equals(p1));
        
        System.out.printf("Segment s = p1: (%.2f,%.2f), p2: (%.2f,%.2f)\n\n", 
        s.getP1().getX(), s.getP1().getY(), s.getP2().getX(), s.getP2().getY());

        Segment s2 = new Segment(3, 3, 3, 4);
        //s2.translate(2,3);

        System.out.printf("Segment Translated to s2 = p1: (%.2f,%.2f), p2: (%.2f,%.2f)\n", 
        s2.getP1().getX(), s2.getP1().getY(), s2.getP2().getX(), s2.getP2().getY());

        System.out.println("s2 length = " + s2.length());
        
        System.out.println("equal function: " + s.equals(s2));

        System.out.println("Slope: " + s.getSlope());
        System.out.println("Intercept: " + s.getIntercept());

        System.out.println("Is p3 on line?: " + s.isOnLine(p3));
        System.out.println("Is p4 on line?: " + s.isOnLine(p4));
        
    }
}
