

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

    public boolean equals(Point p){
        return p.getX()==this.x && p.getY()==this.y;
    }

    public String toString() {
        return "(x: "+ this.x +",y: " + this.y+")";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // It is shallow cloning.
    }
}