package pp2.week03.geometry;

public class Segment {

private Point p1;
private Point p2;

public Segment(Point p1, Point p2)
{
    this.p1=p1;
    this.p2=p2;
}

public Segment(float x1, float y1, float x2, float y2 ){
// this.p1 = new Point(x1, y1);
// this.p2 = new Point(x2, y2);
this(new Point(x1, y1), new Point(x2, y2));

}
public Point getP1() {
    return p1;
}
public void setP1(Point p){
    this.p1=p;
}
public Point getP2() {
    return p2;
}
public void setP2(Point p){
    this.p2=p;
}

public void translate(float dx, float dy) {
    this.p1.translate(dx, dy);
    this.p2.translate(dx, dy);
}
public float lentgh() {
    return p1.distance(p2);
}
public boolean equals(Segment s){
float k1=(s.p1.gety()-s.p2.gety())/(s.p1.getx()-s.p2.getx());
float k2=(this.p1.gety()-this.p2.gety())/(this.p1.getx()-this.p2.getx());
float b1=s.p1.gety()-k1*s.p1.getx();
float b2=this.p2.gety()-k2*this.p2.getx();
if(k1==k2 && b1==b2) return true;
else return false;
}
public float getSlope(){
return (this.p1.gety()-this.p2.gety())/(this.p1.getx()-this.p2.getx());
}

}

