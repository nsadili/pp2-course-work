package Week06.Ex7;

public class Circle extends Shape implements Resizable {
    protected double radius=1.0;

   public Circle(){

   }
   public Circle(double radius){
    this.radius=radius;
   }
   public Circle(double radius, String color,boolean filled){
   super(color, filled);
   this.radius=radius;
   }
public double getRadius() {
    return radius;
}
public void setRadius(double radius) {
    this.radius = radius;
}
@Override
public double getArea() {
   return  Math.PI*radius*radius;
}
@Override
public double getPerimeter() {
    return 2* Math.PI*radius;
    
   
}
@Override
public String toString(){
    return "Circle[Shape[color=" + color + ", filled="+ filled + "]" + ", radius=" + radius+ "]";

}
@Override
public void resize(double percent) {
   radius *= (1+percent/100);
   
 
    
}
}
