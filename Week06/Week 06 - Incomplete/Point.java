

public class Point implements Cloneable, Moveable {
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
        return "("+ this.x +", " + this.y+")";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // It is shallow cloning.
    }

    @Override
    public void moveUp(int n) {
        this.y+=n;
    }

    @Override
    public void moveDown(int n) {
        this.y-=n;
    }

    @Override
    public void moveLeft(int n) {
        this.x-=n;
    }

    @Override
    public void moveRight(int n) {
        this.x+=n;
    }
}