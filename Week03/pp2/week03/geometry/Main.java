package pp2.week03.geometry;

public class Main {
 public static void main(String[] args) {
       float x=Float.parseFloat(args[0]);
       float y=Float.parseFloat(args[1]);
Point p1=new Point();

Point p2=new Point(3.0f,5.0f);

Segment s1 = new Segment(p1,p2);

System.out.println(p1.getX() + ", " + p1.getY());
System.out.println(p2.getX() + ", " + p2.getY());

    }
    
}

