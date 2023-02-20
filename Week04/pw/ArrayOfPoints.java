import pp2.week03.geometry.Point;
import java.util.Scanner;
public class ArrayOfPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please add numbers: ");
        int n=sc.nextInt();

        Point[] p = new Point[n];
        System.out.println("Please add values: ");
        for (int i=0; i<n; i++){

            float x=sc.nextFloat();
            float y=sc.nextFloat();

            p[i] = new Point (x,y); 
        }

        float NorthY=Float.MIN_VALUE;
        float NorthX=0;
        float SouthY=Float.MAX_VALUE;
        float SouthX=0;
        float EastY=0;
        float EastX=Float.MIN_VALUE;
        float WestY=0;
        float WestX=Float.MAX_VALUE;

        for (int i=0; i<n; i++){

            if (p[i].getY()>NorthY) {
                NorthY=p[i].getY(); 
                NorthX=p[i].getX();
            }
            if (p[i].getY()<SouthY) {
                SouthY=p[i].getY(); 
                SouthX=p[i].getX();
            }
            if (p[i].getX()>EastY) {
                EastY=p[i].getY(); 
                EastX=p[i].getX();
            }
            if (p[i].getX()<WestX) {
                WestY=p[i].getY(); 
                WestX=p[i].getX();
            }
        }

        Point north = new Point(NorthX, NorthY);
        Point south = new Point(SouthX, SouthY);
        Point east = new Point(EastX, EastY);
        Point west = new Point(WestX, WestY);


        System.out.println("northern point is: "+ north.toString());
        System.out.println("southern point is: "+ south.toString());
        System.out.println("eastern point is: "+ east.toString());
        System.out.println("western point is: "+ west.toString());
    }
}
