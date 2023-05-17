package Week06;

public class Segment {
    private Point startPoint;
    private Point endPoint;
    
    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    
    // Getters and setters
    
    @Override
    public String toString() {
        return "Segment: " + startPoint.toString() + " to " + endPoint.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Segment other = (Segment) obj;
        return startPoint.equals(other.startPoint) && endPoint.equals(other.endPoint);
    }
}
