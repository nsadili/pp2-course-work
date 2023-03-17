package Week04;

import java.util.List;


import java.util.ArrayList;

class Point{
    float x;
    float y;

public Point(float x, float y){
    this.x = x;
    this.y = y;
}
}
public class ArrayOfPoints {
    public static void main(String [] args){

        List<Point> points = new ArrayList<>();
        points.add(new Point(6, 7));
        points.add(new Point(3, 5));
        points.add(new Point(8, 22));
        points.add(new Point(22, 5));
        Point norhtern = null;
        Point southern = null;
        Point western  = null;
        Point eastern  = null;
        for(Point p : points){
            if (norhtern == null || p.y > norhtern.y){
                norhtern = p;
            }
            if (southern == null || p.y < southern.y){
                southern = p;
            }
            if (western == null || p.x < western.x){
                western = p;
            }
            if (eastern == null || p.x > eastern.x){
                eastern = p;
            }
        }
            System.out.println("northern points: " + norhtern.x + "," + norhtern.y);
            System.out.println("southern points: " + southern.x + ","+ southern.y);
            System.out.println("eastern points: "+ eastern.x + ","+ eastern.y);
            System.out.println("westers points: "+ western.x +","+ western.y);
        
}
}
