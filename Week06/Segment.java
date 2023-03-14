package Week06;

public class Segment implements Movable {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2){
        //  this.p1 = new Point(x1,y1);
        //  this.p2 = new Point(x2,y2);
         this(new Point(x1,y1), new Point(x2,y2));

    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
    public float getSlope(){
        return (this.getP1().getY() - this.getP2().getY()) / (this.getP1().getX() - getP2().getX());
    }

    public float getIntercpet(){
        return this.getP1().getY() - this.getP1().getX() * getSlope();
    }

    public void translate(float dX, float dY){
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length(){
        return p1.distance(p1);
    }
    public boolean isOnLine(Point p){
        return p.getY() == p.getX() * this.getSlope() + this.getIntercpet();
    }

    public boolean isOnSegment(Point p){
        return isOnLine(p) && p.getX() >= this.getP1().getX() && p.getX() <= this.getP2().getX();
    }

    @Override
    public String toString(){
        return "[" + this.p1 + "," + this.p2 +"]";
            
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Segment s = (Segment) obj;
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        p1.moveUp();
        p2.moveUp();
        // throw new UnsupportedOperationException("Unimplemented method 'moveUp'");
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        p1.moveDown();
        p2.moveDown();
   
        // throw new UnsupportedOperationException("Unimplemented method 'moveDown'");
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        p1.moveLeft();
        p2.moveLeft();
        // throw new UnsupportedOperationException("Unimplemented method 'moveLeft'");
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        p1.moveRight();
        p2.moveRight();
        // throw new UnsupportedOperationException("Unimplemented method 'moveRight'");
    }
}
