package Week06.Ex5;

public class Point{
    
    private float x;
    private float y;

    public Point(){
        //Default constructor
        this(3, 3);

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void translate(float dX, float dY){
        this.x += dX;
        this.y += dY;
    }
    public float distance(Point p){
        //this as the current point
        //p as the incoming point
       float dist = (float) Math.sqrt( Math.pow(p.getX() - this.x , 2)
       + 
       Math.pow(p.getY() - this.y , 2));
       
       return dist;
    }
    public boolean equals(Point p){
        return (this.x == p.getX() && this.y == p.getY());
    }
}