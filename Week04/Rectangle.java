public class Rectangle {
    int width, height;
    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }
    public boolean equals(Object obj){
        Rectangle rectangle =(Rectangle) obj;
       return width== rectangle.width && height == rectangle.height;

    }
    public static void main(String[] arg){
        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(15,10);
        Rectangle r3 = new Rectangle(5,10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square (15);

        System. out.println ("Objects are identical: "+ o1.equals (o2));
        System. out.println ("Objects are identical: "+ o1.equals (o3));
        System.out.println ("Objects are identical: " + o2.equals (o3));
    }
}
