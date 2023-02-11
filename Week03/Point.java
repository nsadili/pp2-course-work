package pp2.week3.geometry;


public class Point {
     private float x;
    private float y;
    public Point(){

    }

public Point (float x,float y)
    {
        this.x=x;
        this.y=y;

    }
    public Point(Point p)


    {
        this.x=p.x;
        this.y=p.y;


    }


public float getX(){
    return x;
}
public float getY(){
    return y;
}
public void setX(float x){
    this.x=x;
}

public void setY(float y){
    this.y=y;
}


public void translate (float dx,float dy){
    this.x+=dx;
    this.y+=dy;
}

public float distance(Point p){

float dist=(float) Math.sqrt(Math.pow((p.x-this.x),2) +Math.pow((p.y-this.y),2));
return dist;
}

public boolean equals(Point p)
{
    return p.x==this.x && this.y == p.y;
}

}

