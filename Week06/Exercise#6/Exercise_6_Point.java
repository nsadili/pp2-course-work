package exercise_06;

public class Point implements Movable{
    
    private float x;
    private float y;

    public Point(){
        
        this(3, 3);

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

    public void translate(float dX, float dY){
        this.x += dX;
        this.y += dY;
    }
    public float distance(Point p){
    
       float dist = (float) Math.sqrt( Math.pow(p.getX() - this.x , 2)
       + 
       Math.pow(p.getY() - this.y , 2));
       
       return dist;
    }
    public boolean equals(Point p){
        return (this.x == p.getX() && this.y == p.getY());

    }

@Override
public Movable moveUp(int steps) {
   this.y += steps;
    return this;
    
}
@Override
public Movable moveDown(int steps) {
   this.y -= steps;
   return this;
    
}
@Override
public Movable moveRight(int steps) {
   this.x+= steps;
   return this;
}
@Override
public Movable moveLeft(int steps) {
   this.x-=steps;
   return this;
}
}