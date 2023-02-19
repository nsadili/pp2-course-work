import java.util.Scanner;
import pp2.points.Point;
public class ArrayOfPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n=sc.nextInt();
        Point[] p = new Point[n];
        for (int i=0; i<n; i++){
            float x=sc.nextFloat();
            float y=sc.nextFloat();
            p[i]=new Point (x,y); 
        }
        float Ny=Float.MIN_VALUE,Nx=0;
        float Sy=Float.MAX_VALUE,Sx=0;
        float Ey=0,Ex=Float.MIN_VALUE;
        float Wy=0,Wx=Float.MAX_VALUE;
        for (int i=0; i<n; i++){

            if (p[i].getY()>Ny) {
                Ny=p[i].getY(); 
                Nx=p[i].getX();
            }
            if (p[i].getY()<Sy) {
                Sy=p[i].getY(); 
                Sx=p[i].getX();
            }
            if (p[i].getX()>Ex) {
                Ey=p[i].getY(); 
                Ex=p[i].getX();
            }
            if (p[i].getX()<Wx) {
                Wy=p[i].getY(); 
                Wx=p[i].getX();
            }
        }
        sc.close();

        Point northern = new Point(Nx, Ny);
        Point southern = new Point(Sx, Sy);
        Point eastern = new Point(Ex, Ey);
        Point western = new Point(Wx, Wy);


        System.out.println("northern point is: ("+ northern.getX()+","+northern.getY()+")");
        System.out.println("southern point is: ("+ southern.getX()+","+southern.getY()+")");
        System.out.println("eastern point is: ("+ eastern.getX()+","+eastern.getY()+")");
        System.out.println("western point is: ("+ western.getX()+","+western.getY()+")");
        
    }
}