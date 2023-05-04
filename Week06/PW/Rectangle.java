public class Rectangle extends Shape implements Cloneable {
    private double a = 1.0;
    private double b = 1.0;

    public Rectangle(){

    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Rectangle(double a, double b, String color, boolean filled) {
        this.a = a;
        this.b = b;
        this.color = color;
        this.filled = filled;
    }


    public void set(double a, double b) {
        this.a = a;
        this.b = b;
    }

    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null)
        return false;
        if (!(obj instanceof Segment)) //or Rectangle instead of Segment bc Square is a type of rectangle
            return false;
            Rectangle that =(Rectangle)obj;
            return  this.a == that.a && this.b== that.b;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        
        return (Rectangle) super.clone();
    }

    @Override
    public double getArea() {
      return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
   

    public String toString() {
        return "Rectangle[Shape[color=" + color + ", filled=" + filled + ", width=" + a + ", length=" + b + "]";
    }
  

    
}
