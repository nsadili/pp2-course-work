package pp2.week03.geometry;
public class Point {
    
    private float x;
    private float y;

    public Point() {
        // default constructor
        //this.x = 3;
        //this.y = 3;
        //this.x = 0;
        //this.y = 0;
        this(0, 0);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }  

    public void translate(float dX, float dY) {

        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
       float dist = (float)Math.sqrt(
            Math.pow(p.getX() - this.getX() , 2)
             + 
            Math.pow(p.getY() - this.getY(), 2)
       );
        /* or you can just write x instead of this.getX() */

        /* Math.hypot(Math.pow(p.getX() - this.getX() , 2), Math.pow(p.getX() - this.getY(), 2));
        */

        return dist;

    }

    public boolean equals(Point p) {
        if (p.getX() == this.getX() && p.getY() == this.getY()) 
            return true;
        else
            return false;
        
        
    }

   
}
