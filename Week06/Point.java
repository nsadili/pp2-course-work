/**
 * @author Nuraddin Sh. Sadili
 */
public class Point implements Cloneable, Movable {
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

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if(!(obj instanceof Point)) return false;
        Point that = (Point) obj; //downcasting
        return this.x == that.x && this.y == that.y;
    }
    @Override
    public Movable moveUp(int steps){
        this.y+=steps;
        return this;
    }
    @Override
    public Movable moveDown(int steps){
        this.y-=steps;
        return this;
    }
    @Override
    public Movable moveRight(int steps){
        this.x+=steps;
        return this;
    }
    @Override
    public Movable moveLeft(int steps){
        this.x-=steps;
        return this;
    }

}