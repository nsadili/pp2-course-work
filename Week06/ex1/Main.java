package ex1;

public class Main {
    public static void main(String [] args) throws CloneNotSupportedException
    {
        Point p1 = new Point(1,2);
        Point p2 = (Point) p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        Segment s1= new Segment(2, 3, 4, 5);
        Segment s2=(Segment) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        
    }
}

