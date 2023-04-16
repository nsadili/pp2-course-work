/**
 * @author Nuraddin Sh. Sadili
 */
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
        // TODO

        return false;
    }

    public String toString() {
        // TODO
        return "";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// What if the another class extends Point
// Will it have the same behavior of equals() and toString() as Point?
// TODO: define a class, extending Point. Test of it implicitly has those
// methods?