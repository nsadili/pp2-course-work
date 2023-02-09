package EXWeek03;

public class Point {
    private float x;
    private float y;

    public Point() {
        //EMPTY
        //this.x=10;
        //this.y=10;
        this(10, 10);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void translate(float dX, float dY){
        this.x+=dX;
        this.y+=dY;
    }
    public float distance(Point p){
        //this -> current object
        //p => new point object
        float dist = (float) Math.sqrt(
                Math.pow(this.x-p.x, 2)
                        + Math.pow(this.y-p.y, 2));
        return dist;
    }
    public boolean equals(Point p){
        return this.x==p.x && this.y==p.y;
    }
}