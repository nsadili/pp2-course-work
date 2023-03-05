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

    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(! (obj instanceof Point) ) return false; 
        Point that = (Point) obj; //downcasting
        return this.x == that.x && this.y == that.y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public Movable moveUp(int steps) {
        this.y+=steps;
        return this;
    }

    public Movable moveDown(int steps) {
        this.y-=steps;
        return this;
    }

    public Movable moveRight(int steps) {
        this.x+=steps;
        return this;
    }

    public Movable moveLeft(int steps) {
        this.x-=steps;
        return this;
    }
}

// What if the another class extends Point
// Will it have the same behavior of equals() and toString() as Point?
// TODO: define a class, extending Point. Test of it implicitly has those
// methods?