public class Segment2 implements Cloneable {
    private Point startPoint;
    private Point endPoint;


    @Override
    public Segment clone() {
        try {
            Segment clone = (Segment) super.clone();
            clone.startPoint = this.startPoint.clone();
            clone.endPoint = this.endPoint.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); 
        }
    }
}
