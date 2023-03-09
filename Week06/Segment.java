public class Segment implements Cloneable, Movable{
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public boolean equals(Object obj){
        Segment s = (Segment) obj;
        if(p1 == s.p1 && p2 == s.p2) return true;
        else return false;
    }

    @Override
    public String toString(){
        return p1 + " " + p2;
    }

    @Override
    public Segment clone() throws CloneNotSupportedException{
       return (Segment) super.clone();
    }

    public void moveUp(Object obj, int n){
        Segment s = (Segment) obj;
        s.p1.moveUp(obj, n);
        s.p2.moveUp(obj, n);
    }

    public void moveDown(Object obj, int n){
        Segment s = (Segment) obj;
        s.p1.moveDown(obj, n);
        s.p2.moveDown(obj, n);
    }

    public void moveLeft(Object obj, int n){
        Segment s = (Segment) obj;
        s.p1.moveLeft(obj, n);
        s.p2.moveLeft(obj, n);
    }

    public void moveRight(Object obj, int n){
        Segment s = (Segment) obj;
        s.p1.moveRight(obj, n);
        s.p2.moveRight(obj, n);
    }
}