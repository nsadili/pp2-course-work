public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1,Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1,float y1,float x2,float y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void translate(float dX, float dY) {
        p1.translate(dX, dY); 
        p2.translate(dX, dY); 
    }

    public float length(){
        float xDiff = p2.getX() - p1.getX();
        float yDiff = p2.getY() - p1.getY();
        return (float) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
