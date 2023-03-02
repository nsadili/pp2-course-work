public class Rectangle {

    int width; 
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;

        if (rect.height == this.height && rect.width == this.width)
         
         return true;
       
         else
         
         return false;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
    }
    
}