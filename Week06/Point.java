package Week06;

import java.util.Objects;


public abstract class Point implements Cloneable, Movable {
    private float x;
    private float y;

    public Point() {
        this(0.0f, 0.0f);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (obj ==  null) return false;
        if (obj.getClass() != this.getClass() ) return false;
        Point p = (Point) obj;
        if (p != this) return false;
        return Objects.equals(p.x, this.x) && Objects.equals(p.y, this.y);

        
    }

    public String toString() {
        return "x: " + this.x + " y: " + this.y;
    }
    

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public Movable moveUp(int steps){
        this.y  +=steps;
        return this;
    }
    
    public Movable moveDown(int steps){
        this.y -=steps;
        return this;
    }
    public Movable moveRight(int steps){
        this.x +=steps;
        return this;
    }
    public Movable moveLeft(int steps){
        this.x-=steps;
        return this;
    }
    
}

