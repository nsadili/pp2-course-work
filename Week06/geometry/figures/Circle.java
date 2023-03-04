package geometry.figures;

import geometry.others.Movable;
import geometry.others.Point;
import geometry.others.Resizable;

public class Circle extends Shape implements Movable, Resizable {
    protected Point p;
    protected double r = 1.0;
    
    public Circle(){};
    public Circle(double r){
        setR(r);
    };
    public Circle(Point p, double r, String color, boolean filled){
        setP(p);
        setR(r);
        setColor(color);
        setFilled(filled);
    }
    
    public Point getP() {
        return p;
    }

    public double getR() {
        return r;
    }
    
    public void setP(Point p) {
        this.p = p;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public String toString(){
        return "Circle[Shape[" + this.color + ", filled = " + this.filled + ", radius = " + this.r + "]]";
    }

    @Override
    public Movable moveUp(int steps) {
        int currentY = (int) this.p.getY();
        currentY += steps;
        this.p.setY(currentY);
        return this.p;
    }

    @Override
    public Movable moveDown(int steps) {
        int currentY = (int) this.p.getY();
        currentY -= steps;
        this.p.setY(currentY);
        return this.p;
    }

    @Override
    public Movable moveLeft(int steps) {
        int currentX = (int) this.p.getX();
        currentX -= steps;
        this.p.setX(currentX);
        return this.p;
    }

    @Override
    public Movable moveRight(int steps) {
        int currentX = (int) this.p.getX();
        currentX += steps;
        this.p.setX(currentX);
        return this.p;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * r * Math.PI;
    }

    @Override
    public void resize() {
        throw new UnsupportedOperationException("Unimplemented method 'resize'");
    }
    
}
