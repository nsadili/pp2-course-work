import java.util.Arrays;

import Ex06.Circle;
import Ex06.Movable;
import Ex06.Point;
import Ex06.Segment;

public class TestEx06 {
    public static void main(String[] args) {
        Point p1= new Point(2,5);
        Point p2= new Point(5,10);
        Circle c1= new Circle(p1, 6);
        Circle c2= new Circle(p2, 7);
       
        Segment s1= new Segment(p1,p2);
        Segment s2= new Segment(2,5,5,10);
        p1.moveUp(5).moveRight(3);
        System.out.println(p1);
        s1.moveDown(5).moveDown(3);
        System.out.println(s1);
        c1.moveRight(7).moveUp(4);
        System.out.println(c1);
        
        var arr = new Movable[6];
        arr[0]= p1;
        arr[1]=p2;
        arr[2]= s1;
        arr[3]= s2;
        arr[4]= c1;
        arr[5]= c2;
        MaveAllUp(arr);
        System.out.println("Our arrays of a mixture of Points, Segments, Circles: "+ Arrays.toString(arr));
       
    }
    static void MaveAllUp(Movable[]arr){
        for(Movable obj : arr){
            obj.moveUp(1);
        }

    }

}
