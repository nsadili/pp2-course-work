abstract class Shape {
    protected String color;
    protected Boolean filled;
    
    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public boolean isFilled() {
        if(filled==true) return true;
        else return false;
    }

    public void setFilled(boolean filled) {
        this.filled=filled;
    }
}
    abstract double getArea() {
        if(obj==null) return false;
        if(! (obj instanceof Shape) ) return false; 
        if(obj==circle) return 3.14*rad*rad;
    }
    



