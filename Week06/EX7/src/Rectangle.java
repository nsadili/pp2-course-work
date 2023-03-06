import java.util.Scanner;
public class Rectangle extends Shape implements Resizable{
    private double width = 1.0;
    private double length = 1.0;



    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color,boolean filled){
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
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

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }

    public String toString(){
        return "Rectangle" + super.toString() + ", width = " + this.width + " , length = " + this.length + " ]";
    }

    public void resize(double resizableTo){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to add or multiply width and length to  entered digit?");
        String s = scan.nextLine();
        if(s.contains("a")){
         this.width += resizableTo;
         this.length += resizableTo;
        }else{
            this.width *= resizableTo;
            this.length *= resizableTo;
        }
    }
}
