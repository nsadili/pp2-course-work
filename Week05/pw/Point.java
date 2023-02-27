package pw.pp2.week05.geometry;

public class Point {
    private float x;
    private float y;

    public Point(){
        //empty (DEFAULT) constructor
       // this.x = 3;
       // this.y = 3;
       this(3,3);
    }
    
    public Point (float x, float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){ // we created accessor to get the variable X
        return this.x;
    }

    public float getY(){ // we created accessor to get the variable Y
        return this.y;
    }

    public void translate(float dX, float dY){
        this.x+=dX;
        this.y+=dY;
    }

    public float distance(Point p){
        //this as the current point
        //p as the incoming point
        float distance = (float) Math.sqrt(Math.pow(p.getX()-this.getX(), 2) + Math.pow(p.getY()-this.getY(), 2));
        return distance;

        //Math.hypot(Math.pow(p.getX()-this.getX(), 2), Math.pow(p.getY()-this.getY(), 2));
    }

    public boolean equals(Point p){
        return p.x==this.x && p.y==this.y;
    }

    public boolean equals(Object o){
        Point p= (Point) o;
        return p.x==this.x && p.y==this.y;
    }

    public String toString(){
        return String.format("x: %.2f , y: %.2f",this.x,this.y);
    }
}