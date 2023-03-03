package geometry;

public class GeometryTest {
    public static void main(String[] args) {
        Point p1=new Point(5, 8);
        Point p2=new Point(6, 4);
        Point p3=new Point(5, 8);

        System.out.println("point 1: "+ p1.toString());
        System.out.println("point 2: "+ p2.toString());
        System.out.println("point 3: "+ p3.toString());

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        Segment s1= new Segment(p1, p2);
        Segment s2= new Segment(p3, p2);
        Segment s3= new Segment(5, 8, 10, 15);

        System.out.println("segment 1: "+ s1.toString());
        System.out.println("segment 2: "+ s2.toString());
        System.out.println("segment 3: "+ s3.toString());

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


        



    }   
}
