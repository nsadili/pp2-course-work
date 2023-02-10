package pp2.week03.geometry;

public class Point {
    
private float x;
private float y;

public Point(){
// EMPTY (DEFAULT) CONSTTUCTOR
//this.x = 1;
//this.y = 1;
this(1,1);
}
public Point(float x, float y){
this.x = x;
this.y = y;
}
public Point(Point p){
    this.x=p.x;
    this.y=p.y;
}
public float getx(){
    return x;
}
public void setx(float x){
this.x=x;
}
public float gety(){
    return y;
}
public void sety(float y) {
    this.y=y;
}
public void translate(float dx,float dy){
    this.x+=dx;
    this.y+=dy;
}
public float distance(Point p){
    //this as the current point
    //p as the incoming point
    float res = (float)Math.sqrt(Math.pow(p.getx() - this.getx(), 2)
    +
    Math.pow(p.gety() - this.gety(),2));
return res;
}
public boolean equals(Point p) {
    if(p.x==this.getx() || p.y==this.gety () )
    return true;
    else return false;
}

}
