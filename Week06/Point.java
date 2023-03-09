public class Point implements Cloneable, Movable{
    private float x;
    private float y;

    public Point(){
        this(0.0f, 0);
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this(p.x, p.y);
    }

    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }

    @Override
    public boolean equals(Object obj){
        Point p = (Point) obj;
        if(x == p.x && y == p.y) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void moveUp(Object obj, int n){
        Point p = (Point) obj;
        p.y += n;
    }

    public void moveDown(Object obj, int n){
        Point p = (Point) obj;
        p.y -= n;
    }

    public void moveLeft(Object obj, int n){
        Point p = (Point) obj;
        p.x -= n;
    }

    public void moveRight(Object obj, int n){
        Point p = (Point) obj;
        p.x += n;
    }
}
