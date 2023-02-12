package Week3.geometry;

public class Point {

    private float x;
    private float y;

    public Point(){
        //Empty cnstructor or default constructor
        /*
        this.x = 3;
        this.y = 3;
        */
        this(3,3);
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

    public void setX(float x){
        this.x = x;
    }

    public void translate(float dX, float dY){
        float newX = this.x+dX;
        float newY = this.y+dY;
        System.out.println(newX+" "+newY);
    }

    public float distance(Point p){
        float dist =(float) Math.sqrt( Math.pow(p.getX()-x, 2) + Math.pow(p.getY()-y, 2));

        return dist;

    }
    public Point(Point p){

    }

}
