package pp2.week03.geometry;

public class Point {

    private float x;
    private float y;

    public Point() {
        // EMPTY(DEFAULT) CONSTRUCTOR
        //this.x=3;
        //this.y=3;
        this(3,3); 
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public void translate(float dX, float dY){
        this.x+=dX;
        this.y+=dY;
    }

    public float distance(Point p){
        float dist=(float)Math.sqrt(Math.pow(p.getX()-this.getX(),2)
        +
        Math.pow(p.getY()-y,2)
        );
        return dist;
    }

    public boolean equals(Point p){
        if(p.x==this.x && p.y==this.y) return true;
        else return false;
    }
}