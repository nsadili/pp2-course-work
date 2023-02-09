package pp2.week3.geometry;

public class Point{

    private float x;
    private float y;

    public Point(){
        //default consturctor
    //    this.x=3;
    //    this.y=3;
     this(3,3);

    }

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }
    
    public void setX(float x){
        this.x=x;
    }

    public void setY(float y){
        this.y=y;
    }

    public void translate(float dX,float dY){
        this.x+=dX;
        this.y+=dY;
    }

    public float distance(Point p){

       //return (float) Math.sqrt(Math.pow(p.getX()-this.x, 2) + Math.pow(p.getY()-y, 2));

     return (float) Math.hypot(x-p.x, y-p.y) ;


    }

    public boolean equals(Point p){
        return p.x==this.x && p.y==this.y;
    }


}