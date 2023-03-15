import java.util.Scanner;

public class ArrayOfPoints {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Number of points: ");
        int l=scan.nextInt();
        Points[] p=new Points[l];
        int x,y;
        Points north= null;
        Points south= null;
        Points east= null;
        Points west= null;
        for(int i=0;i<l;i++){
            System.out.printf("Insert point %d: ",i+1);
            x=scan.nextInt();
            y=scan.nextInt();
            p[i]=new Points(x,y);
            if (north == null || y > north.getY()) {
                north = p[i];
            }

            if (south == null || y < south.getY()) {
                south = p[i];
            }

            if (west == null || x < west.getX()) {
                west = p[i];
            }

            if (east == null || x > east.getX()) {
                east = p[i];
            }
        }
        System.out.println("The most North: ("+north.getX()+","+north.getY()
        +")\nThe most South: ("+south.getX()+","+south.getY()
        +")\nThe most East: ("+east.getX()+","+east.getY()
        +")\nThe most West: ("+west.getX()+","+west.getY()+")");
    }
}

class Points{
    private int x;
    private int y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
