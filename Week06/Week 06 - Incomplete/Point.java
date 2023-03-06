/**
 * @author Nuraddin Sh. Sadili
 */
public class Point implements Cloneable, Movable{
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
        if (obj == null) return false;

        
        Point a = (Point) obj;
        return a.x == this.x && a.y==this.y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //MOVABLE
    @Override
    public Movable moveUp(int a){
        this.y+=a;
        return this;
    }
    @Override
    public Movable moveDown(int a) {
        this.y-=a;
        return this;
       
    }
    @Override
    public Movable moveLeft(int a) {
        this.x-=a;
        return this;
    }
    @Override
    public Movable moveRight(int a) {
        this.x+=a;
        return this;
    }
}
