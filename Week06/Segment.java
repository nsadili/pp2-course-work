package  Week06;

import java.util.Objects;

/**
 * @author Nuraddin Sh. Sadili
 */
public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    // TODO: equals() method
    public boolean equals(Object obj){
        if(obj == null) return false; 
        if(! (obj instanceof Segment)) return  false;
        Segment seg = (Segment) obj;
        return Objects.deepEquals(seg.p1, this.p1) && Objects.equals(seg.p2, this.p2);


    }
    
    // TODO: toString() method
    public String toString(){
        return "[" + p1 + ", " + p2.toString() + " ] "; 
    }
    public Object clone() throws CloneNotSupportedException{
        Point anew = (Point) this.p1.clone();
        Point bnew = (Point) this.p2.clone();
        return new Segment(anew, bnew);
    }
    public Movable moveUp(int steps){
        this.p1.moveUp(steps);
        this.p2.moveUp(steps);
        return (Movable) this;
    }
    public Movable moveDown(int steps){
        this.p1.moveDown(steps);
        this.p2.moveDown(steps);
        return (Movable) this;
    }
    public Movable moveLeft(int steps){
        this.p1.moveLeft(steps);
        this.p2.moveLeft(steps);
        return (Movable) this;
    }
    public Movable moveRight(int steps){
        this.p1.moveRight(steps);
        this.p2.moveRight(steps);
        return (Movable) this;
    }
    
}