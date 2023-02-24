public class Task10 {
    
}

class Point{
    private int x,y;
    Point(){
        this.x=0;
        this.y=0;
    }
    Point(int x, int y){
        this.x = x;
        this.y= y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    String ToString(){
        return String.format("X:%d Y:%d",this.x,this.y);
    }

    boolean equals(Point p){
        if(p.ToString() == this.ToString())
        return true;
        else
        return false;
    }
}


class Circle extends Point{
    private int r;
    Circle(int x,int y,int r){
        this.setX(x);
        this.setY(y);
        this.r = r;
    }

    String ToString(){
        return String.format("X:%d Y:%d R:",this.getX(),this.getY(),this.r);
    }

    boolean equals(Circle c){
        if(c.ToString() == this.ToString())
        return true;
        else
        return false;
    }
}