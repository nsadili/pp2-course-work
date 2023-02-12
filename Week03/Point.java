package ex1;

public class Point {
   private float x;
   private float y;

   //Constructors
   Point(){
    System.out.println("Constructor created!");
   }

   Point(float x, float y){
    this.x = x;
    this.y = y;
   }

   Point(Point p){
    this.x = p.x;
    this.y = p.y;
   }

//Getters
public float getX() {
    return this.x;
}

public float getY() {
    return this.y;
}

//Setters
public void setX(float x) {
    this.x = x;
}

public void setY(float y) {
    this.y = y;
}

//Methods
public void translate(float dX, float dY){
    setX(dX);
    setY(dY);
}

public float distance(Point p){
    double distX = Math.pow(this.x - p.x, 2);
    double distY = Math.pow(this.y - p.y, 2);
    
    return (float) Math.sqrt(distX + distY);
}

public boolean equals(){
    if(this.x == getX() && this.y == getY()) return true;
    else return false;
}



   
}
