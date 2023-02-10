package pp2.week03.geometry;
public class Point{


    private float x; //field
    private float y;

    public Point(){

        //empty default Constructor
    }

    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.x;
    }
    public void translate(float dX,float dY){
        this.x += dX;
        this.y += dY;
    }
    public float distance(Point p)
    {
        //this -> current object
        //p -> new point object
       float dist = Math.sqrt(
        Math.pow(this.x -p.x,2)
            +Math.pow(this.y-p.y,2));

    }
    public void translate(int i, int j) {
    }
}