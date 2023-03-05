//import javax.print.DocFlavor.STRING;

/**
 * @author Nuraddin Sh. Sadili
 */
public class Segment implements Cloneable, Movable {
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
        if(obj == null) return false;
        if(!(obj instanceof Segment)) return false;

        Segment that = (Segment) obj;

        return p1.equals(that.p1) && p2.equals(that.p2);
    }

    
        @Override
    public String toString(){
        return "[" + p1 + ", " + p2.toString() +"]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{

        Segment cloned= (Segment) super.clone();
        cloned.p1 = (Point) p1.clone();  // cloning Point objects as well
        cloned.p2= (Point) p2.clone();

        return cloned;   // deep cloning
    }

    @Override
    public Movable moveUp(int step) {
        p1.moveUp(step);
        p2.moveUp(step);
        return this;
       
    }

    @Override
    public Movable moveDown(int step) {
        p1.moveDown(step);
        p2.moveDown(step);
        return this;
        
    }

    @Override
    public Movable moveLeft(int step) {
        p1.moveLeft(step);
        p2.moveLeft(step);
        return this;
    }

    @Override
    public Movable moveRight(int step) {
        p1.moveRight(step);
        p2.moveRight(step);
        return this;
    }
    

    // @Override
    // protected Object clone() throws CloneNotSupportedException{

    //     return super.clone();   // shallow cloning. Point class objects is not cloned, just creating another referance to same object
    // }
    
    
}
