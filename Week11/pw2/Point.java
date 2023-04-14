package pw11;


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

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    } 
    
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," +this.y + ")";
    }

}
