package Ex07;

public  class Rectangle extends Shape implements Resizable {
    protected double width =1.0;
    protected double length =1.0;

    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color,boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
       return width*length;
    }
    @Override
    public double getPerimeter() {
    return 2*(width+length);
    }
    @Override
    public String toString(){
    return "Rectangle[Shape[color=" + color +", filled=" + filled +"]" + ", width=" + width + ", length="+length+"]";
    }
    @Override
    public void resize(double percent) {
       width *= (1+percent/100);
       length *=(1+percent/100);
    }
    

    
}
