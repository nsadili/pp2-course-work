package ArrayOfSegemnts;

import ArrayOfPoint.Point;
import Week06.MovableInterface.Movable;

public class Segment implements Movable {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Segment(double x1, double y1, double x2, double y2) {
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
    }

    public Segment(Point p1, Point p2) {
        this(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public Segment(Segment[] x) {
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getDistances() {
        double i = Math.sqrt(Math.pow((this.x1 - this.x2), 2) + Math.pow((this.y1 - this.y2), 2));
        return i;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[(" + x1 + "," + y1 + "):(" + x2 + ":" + y2 + ")]";
    }

    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        y1 += 1;
        y2 += 1;
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        y1 -= 1;
        y2 -= 1;
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        x1 -= 1;
        x2 -= 1;
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        x1 += 1;
        x2 += 1;
    }

}
