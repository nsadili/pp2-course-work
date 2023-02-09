package pp2.week03.geometry;

//import java.util.Set;

public class Point {
    
    public static final boolean SetX = false;
    private float x;
    private float y;

    public Point() {
        // default constructor
        //this.x = 3;
        //this.y = 3;
       this(3, 3);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

  /*  public void SetX(float x) {
       this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }  */

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
