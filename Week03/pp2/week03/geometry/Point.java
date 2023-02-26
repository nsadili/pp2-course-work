package pp2.week03.geometry;

public class Point {
    private float x, y;

    // Empty / Default constructor
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    // Second constructor
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    // Third constructor
    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }
    // Next we get/set before initilized variables
    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }
    // Other methods
    public void translate(float dX, float dY){
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        return (float) (Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2)));
    }

    public boolean equals(Point p) {
        return (this.x == p.getX() && this.y == p.getY());
    }
    

}
