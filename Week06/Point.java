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
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (!(obj instanceof Point))
            return false;

        Point that = (Point) obj;
        return that.x == this.x && that.y == this.y;
    }

    @Override
    public String toString() {
        
        return "(" + x + "," + y + ")";
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Movable moveUp(int step) {
        this.y+=step;
        return this;
       
    }

    @Override
    public Movable moveDown(int step) {
        this.y-=step;
        return this;
       
    }

    @Override
    public Movable moveLeft(int step) {
        this.x-=step;
        return this;
    }

    @Override
    public Movable moveRight(int step) {
        this.x+=step;
        return this;
    }

    public void methodInPoint(){

    }

    
}

// What if the another class extends Point
// Will it have the same behavior of equals() and toString() as Point?
// TODO: define a class, extending Point. Test of it implicitly has those
// methods?