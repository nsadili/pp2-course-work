package Week06.MovableInterface;

import ArrayOfPoint.Point;

public class Cycle implements Movable {
    private Point p = new Point();
    private double r;

    public Cycle(double x, double y, double r){
        this.p.setX(x);
        this.p.setY(y);
        setR(r);
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void moveUp() {
        this.p.moveUp();
    }

    @Override
    public void moveDown() {
        this.p.moveDown();
    }

    @Override
    public void moveLeft() {
        this.p.moveLeft();
    }

    @Override
    public void moveRight() {
        this.p.moveRight();
    }

    @Override
    public String toString() {
        return "C(" + this.p.getX() + "," + this.p.getY() + ") r = " + this.r;
    }

}
