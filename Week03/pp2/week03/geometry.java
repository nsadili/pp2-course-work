package pp2.week03;
import java.lang.Math;
import java.util.Scanner;

public class geometry {
    public static class Point{
        private double x;
        private double y;
        public void setX(double x){this.x = x;}
        public double getX(){return x;}
        public void setY(double y){this.y = y;}
        public double getY(){return y;}
        public Point(){x=0;y=0;}
        public Point(double x, double y){setX(x);setY(y);}
        public Point(Point p){setX(p.x);setY(p.y);}
        public void translate(double dX, double dY){x+=dX;y+=dY;}
        public double distance(Point p){return Math.sqrt((Math.pow(p.x-x, 2)+Math.pow(p.y-y, 2)));}
        boolean equals(Point p){return x == p.x && y == p.y;}
    }
    public static class Segment{
        private Point p1;
        private Point p2;
        public Segment(Point p1, Point p2){
            this.p1= new Point(p1.getX(),p1.getY()); this.p2= new Point(p2.getX(),p2.getY());}
        public Segment(double x1,double y1, double x2,double y2){
            this.p1= new Point(x1,y1); this.p2= new Point(x2,y2);
        }
        void setP1(Point p1){this.p1 = new Point(p1.getX(),p1.getY());}
        public String getP1(){return "x="+ p1.getX()+"y="+ p1.getY();}
        void setP2(Point p2){this.p2 = new Point(p2.getX(),p2.getY());}
        public Point getP2(){return p2;}
        public void translate(double dX,double dY){p1.translate(dX,dY);p2.translate(dX,dY);}
        public double length(){return p1.distance(p2);}
        public boolean equals(Segment s){return p1.equals(s.p1) && p2.equals(s.p2);}
        public double getSlope(){return (p2.getY()-p1.getY())/(p2.getX()-p1.getX());}
        public boolean IsOnLine (Point p) {
            return this.p1.getX() <= p.getX() && this.p2.getX() >= p.getX() && this.p1.getY() <= p.getY() && this.p2.getY() >= p.getY();
        }
    }
    /*
    import java.util.*;
import java.lang.Math;
import pp2.week03.geometry.*;


    class Main {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Point p1= new Point(1,2);
            Point p2= new Point(2,3);
            Segment s1= new Segment(1.1,1.2,1.4,1.3);


            System.out.print("x="+s1.getP2().getY()+" y="+s1.getP2().getX());
        }

    }
    */
}
