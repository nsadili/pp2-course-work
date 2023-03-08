

public class Rectangle extends Shape implements Cloneable {
    protected double a, b;
    protected String color;
    protected boolean filled;

    public Rectangle() {
        this.a = 1;
        this.b = 1;
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
    
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rect = (Rectangle) obj;
        return (this.a==rect.a) && (this.b==rect.b);
    }
    
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        // Using protected access modifier promotes encapsulation and code reuse in object-oriented programming,
        //  while public access should be used when unrestricted access to a member is needed.
    }
    
    public double getWidth() {
        return a;
    }
    
    public void setWidth(double a) {
        this.a = a;
    }
    
    public double getLength() {
        return b;
    }
    
    public void setLength(double b) {
        this.b = b;
    }
    
    public double getArea(){
        return a*b;
    }

    public double getPerimeter(){
        return 2*(a+b);
    }
    
    public String toString() {
        return "Rectangle["+super.toString()+", width="+a+", length="+b;
    }

}
