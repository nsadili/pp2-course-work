
public class Point implements Cloneable, Movable {
    private float x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
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

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        return (float) (Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2)));
    }

    public boolean equals(Point p) {
        return (this.x == p.getX() && this.y == p.getY());
    }
    
    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen
        }
    }

    public Movable moveUp(int steps){
        this.y += steps;
        return this;
    }
    public Movable moveDown(int steps){
        this.y -= steps;
        return this;
    }
    public Movable moveRight(int steps){
        this.x += steps;
        return this;
    }
    public Movable moveleft(int steps){
        this.x -= steps;
        return this;
    }

    @Override
    public Movable modeLeft(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modeLeft'");
    }
}


class Segment implements Movable, Cloneable {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getp1() {
        return p1;
    }

    public void setp1(Point p1) {
        this.p1 = p1;
    }

    public Point getp2() {
        return p2;
    }

    public void setp2(Point p2) {
        this.p2 = p2;
    }

    public double length() {
        return p1.distance(p2);
    }

    public void translate(float dX, float dY) {
        p1.translate(dX, dY);
        p2.translate(dX, dY);
    }

    public boolean equals(Object obj) {
        if(obj==null) return false;
        if (!(obj instanceof Segment)) return false;
        Segment that = (Segment) obj;
        return this.p1.equals(that.p1) && this.p2.equals(that.p2);
    }

    @Override
    public Segment clone() throws CloneNotSupportedException {
        Segment clone = (Segment) super.clone();
        clone.p1 = p1.clone();
        clone.p2 = p2.clone();
        return clone;
    }

    @Override
    public Movable moveUp(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveUp'");
    }

    @Override
    public Movable moveDown(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveDown'");
    }

    @Override
    public Movable modeLeft(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modeLeft'");
    }

    @Override
    public Movable moveRight(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveRight'");
    }

}
class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(5, 10);
        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(2, 5, 5, 10);
        p1.moveUp(5).moveRight(3);
        System.out.println(p1);
        s1.moveDown(5).moveDown(3);
    }
}
interface Movable {
    Movable moveUp(int steps);
    Movable moveDown(int steps);
    Movable modeLeft(int steps);
    Movable moveRight(int steps);
}

