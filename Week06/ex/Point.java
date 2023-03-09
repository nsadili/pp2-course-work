public class Point implements Movable, Cloneable {
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
        if (obj == null || !(obj instanceof Point)) return false;
        Point p = (Point)obj;
        return x == p.x && y == p.y;
    }
    public String toString() {
        
        return "("+ this.x + ","+ this.y+ ")";
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public void moveUp() {
        setY(y--);
    }

    @Override
    public void moveDown() {
        setY(y++);
    }

    @Override
    public void moveLeft() {
        setX(x--);
    }

    @Override
    public void moveRight() {
        setX(x++);
    }
}
