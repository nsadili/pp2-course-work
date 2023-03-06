
public class Rectangle extends Shape implements Cloneable {
    protected double a=1.0;
    protected double b=1.0;

    public Rectangle(){

    }
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Rectangle(double a, double b, String color, boolean filled){
        this.a = a;
        this.b = b;
        this.color = color;
        this.filled = filled;
    }

    //GETTER and SETTER
    
    public double getWidth(){
        return this.a;
    }
    public void setWidth(double a){
        this.a = a;
    }
    public double getLength() {
        return this.b;
    }
    public void setLength(double b){
        this.b = b;
    }

    //AREA
    public double getArea(){
        return a*b;
    }
    //PERIMETR
    public double getPerimetr() {
        return 2 * (this.a + this.b);
    }

    
    public String toString() {
        return "Rectangle[Shape[color="+getColor()+",filled="+this.filled+"],width="+getWidth()+",length="+getLength()+"]";
    }

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean equals(Object obj) {
        // TODO
        return false;
    }

    // TODO: override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,5);
        Rectangle r2 = new Rectangle(5,10);
        
    }

}
