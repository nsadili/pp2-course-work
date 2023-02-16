public class Point {
    private float x;
    private float y;

    //from here we begin to write constructors

    public Point() {  
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    //the end of writing constractors. here we get/set before initialized variables 
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Other Methods
    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        float deltaX = this.x - p.getX();
        float deltaY = this.y - p.getY();
        return (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public boolean equals(Point p) {
        return this.x == p.getX() && this.y == p.getY();
    }
}