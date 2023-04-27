import pp2.week03.geometry.Point;
public class Main{
    public static void main(String[]args){

Point p1 = new Point();
Point p2 = new Point(x:3, y:5);

p1.traslate(dX:2, -1);
p2.traslate(dY:5, dY:2);

    System.out.println(p1.getX + "," p1.getY);
    System.out.println(p2.getX + "," p2.getY);

    System.out.println(p1.distance(p2)); 
    System.out.println(p2.distance(p1));

    }
}   