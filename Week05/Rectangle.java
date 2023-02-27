package Week05;

public  class Rectangle {
    private int side1;
    private int side2;

    public Rectangle(int a, int b){
        this.side1 = a;
        this.side2 = b;
    }

    public double getArea(){
        return this.side1 * this.side2;
    }

    public double getPerimeter(){
        return 2 * (this.side1 + this.side2);
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }
    @Override
    public String toString() {
        return "[side1=" + side1 + ", side2=" + side2 + "]";
    }
    @Override
    public boolean equals(Object obj){
        
        if(obj==this){
            return true;
        }
        if(!(obj instanceof Rectangle)){
            return false;
        }
        Rectangle rect=(Rectangle) obj;
        return rect.side1==this.side1 && rect.side2==this.side2;
    }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(5, 10);
        Rectangle r2=new Rectangle(15, 10);
        Rectangle r3=new Rectangle(5, 10);
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

        Rectangle o1 = new Rectangle(5, 15);
        Rectangle o2 = new Rectangle(15, 15);
        Square o3 = new Square(15);
        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));
    
    }
}