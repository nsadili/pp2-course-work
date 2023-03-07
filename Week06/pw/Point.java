public class Point implements Cloneable, Movable {
    private float x;
    private float y;

    public Point() {

    }

    public Point(float x, float y) {

        this.x = x;
        this.y = y;

    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    
    public void setX(float x) {
        this.x = x;
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

        if (!(obj instanceof Point))
            return false;

        Point that = (Point) obj; 

        return this.x == that.x && this.y == that.y;

    }

    @Override
    public Movable moveUp(int step) {
        this.y += step; 
        return this;
    }

    @Override
    public Movable moveDown(int step) {
        this.y -= step;
        return this;
    }

    @Override
    public Movable moveRight(int step) {
        this.x += step;
        return this;
    }

    @Override
    public Movable moveLeft(int step) {
        this.x -= step;
        return this;
    }
 
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
