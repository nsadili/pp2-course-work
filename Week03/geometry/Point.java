package Week03.geometry;

public class Point{
    private float x;
    private float y; 

    public Point(){

    }

    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y; 
    }

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

    public void translate(float dX, float dY){
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p)
    {
        float dist = (float) Math.sqrt( Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
        return dist;

    }

    public boolean equals(Point p)
    {
        return this.x == p.getX() && this.y == p.getY(); 

    }
    
    @Override 
    public String toString()
    {
        return "X : " + this.getX() + "\n" + 
               "Y : " + this.getY();
    }

}