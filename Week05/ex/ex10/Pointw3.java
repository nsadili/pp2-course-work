package ex10;

public class Pointw3{

    private float x;
    private float y;

    public Pointw3(){
        //default consturctor
    //    this.x=3;
    //    this.y=3;
     this(3,3);

    }

    public Pointw3(float x, float y){
        this.x=x;
        this.y=y;
    }

    // override
    public String toString(){
        return String.format("x: %.2f , y: %.2f",this.x,this.y);
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

    public float distance(Pointw3 p){

       //return (float) Math.sqrt(Math.pow(p.getX()-this.x, 2) + Math.pow(p.getY()-y, 2));

     return (float) Math.hypot(x-p.x, y-p.y) ;


    }

    public boolean equals(Pointw3 p){
        return p.x==this.x && p.y==this.y;
    }
     // overloading
    public boolean equals(Object o){
        Pointw3 p= (Pointw3) o;

        return p.x==this.x && p.y==this.y;
    }


}