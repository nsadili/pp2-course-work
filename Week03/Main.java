import java.util.*;
import java.lang.Math;
import pp2.week03.geometry.*;
import pp2.week03.datetime.*;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Point p1= new Point(1,2);
        Point p2= new Point(2,3);
        Segment s1= new Segment(1.1,1.2,1.4,1.3);
        CustomTime t= new CustomTime(1,35,59);

        System.out.print(t.toStandardString());
    }

}