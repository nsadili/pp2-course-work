public class Segment implements Movable {
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

    // TODO: equals() method
    @Override
    public boolean equals(Object obj) {
        // TODO
        if (obj == null) return false;

        
        Segment a = (Segment) obj;
        return p1.equals(a.p1)&& p2.equals(a.p2);
    }
    
    // TODO: toString() method
    @Override
    public String toString(){
        return "[" + p1 + ", " + p2.toString() +"]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    //MOVABLE
    @Override
    public Movable moveUp(int a) {
        p1.moveUp(a);
        p2.moveUp(a);
        return this;  
    }
    @Override
    public Movable moveDown(int a) {
        p1.moveDown(a);
        p2.moveDown(a);
        return this;   
    }
    @Override
    public Movable moveLeft(int a) {
        p1.moveLeft(a);
        p2.moveLeft(a);
        return this;
    }
    @Override
    public Movable moveRight(int a) {
        p1.moveRight(a);
        p2.moveRight(a);
        return this;
    }
}
