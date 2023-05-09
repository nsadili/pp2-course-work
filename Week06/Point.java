package Week06;



public class Point {
    
    private float x;
    private float y;

    public Point() {
    }
    
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
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

    public double distance(Point p) {
        double dist = Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
        return dist;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Point)) {
            return false;
        }
        Point other = (Point) object;
        return Float.compare(x, other.x) == 0 && Float.compare(y, other.y) == 0;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

}