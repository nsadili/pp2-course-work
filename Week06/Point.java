/**
 * @author Nuraddin Sh. Sadili
 */
package Week06;

public class Point implements Cloneable {
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
        if (obj == null) return false;
        if (!(obj instanceof Point)) return false;
        Point pobj = (Point) obj;
        return pobj.getX() == this.x && pobj.getY() == this.y;
    }

    public String toString() {
        return "(x: " + x + ", y: " + y + ")";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
