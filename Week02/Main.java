package pp2.week3.geometry;

public class Main {
    public static void main(String[]args){
        Point p1= new Point(4,6);
        Point p2= new Point (7,9);

    p1.translate(3,9);


    Segment s1= new Segment(p1,p2);
    System.out.println(s1.length());
}
}
