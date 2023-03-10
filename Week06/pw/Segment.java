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

    @Override
    public String toString(){
        return "[" + p1 + ", " + p2.toString() + "]";
    }

    @Override
    public boolean equals(Object obj){

        if(obj == null) return false;

        if(!(obj instanceof Segment)) return false;

        Segment that = (Segment) obj;

        return this.p1.equals(that.p1) && this.p2.equals(that.p2);
    }

    @Override
    public Movable moveUp(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveUp'");
    }

    @Override
    public Movable moveDown(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveDown'");
    }

    @Override
    public Movable moveLeft(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveLeft'");
    }

    @Override
    public Movable moveRight(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveRight'");
    }
}