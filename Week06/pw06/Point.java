
public class Point {

    private float x; //field
    private float y;

    public Point() {
        //EMPTY (DEFAULT) CONSTRUCTOR
        // this.x = 10;
        // this.y = 10;
        this(10, 10);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // public void setX(float newX) {
    //     x = newX;
    // }
    public float getX() {
        return x;
    }

    // public void setY(float newY) {
    //     y = newY;
    // }
    public float getY() {
        return y;
    }

    // public void translate(float dX, float dY) {
    //     this.x += dX;
    //     this.y += dY;
    // }

    // public float distance(Point p) {
    //     // this --> current obkect
    //     //p --> new point object which sent to this method

    //     float dist = (float) Math.sqrt(
    //         Math.pow(this.x - p.x, 2)
    //         +
    //         Math.pow(this.y - p.y, 2));

    //         // dist = (float) Math.hypot(Math.pow(this.x - p.x, 2)
    //         // +
    //         // Math.pow(this.y - p.y, 2), dist);

    //     return dist;
    // }
    // public boolean equals(Point p) {
    //     if(this.x == this.y){
    //         return true;
    //     }else {
    //         return false;
    //     }
    // }

    @Override
    public String toString() {
        return "(" + this.x + "," +this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) 
            return false;

        if(!(obj instanceof Point)) return false;

        Point that = (Point) obj; // downcasting
        
        return this.x == that.x && this.y == that.y;
    }

}