class rectangle {
    int width, height;

   public rectangle (int w, int h) {
       width = w;
       height = h;
   }
   public boolean equals(Object obj) {
       if (obj == this) {
           return true;
       }
       if (!(obj instanceof rectangle)) {
           return false;
       }
       rectangle rect = (rectangle) obj;
       return width == rect.width && height == rect.height;
   }
public class square extends rectangle {
    public square(int side) {
        super(side, side);
    }
}

    public static void main(String[] args) {
        rectangle r1 = new rectangle(5, 10);
        rectangle r2 = new rectangle(15, 10);
        rectangle r3 = new rectangle(5, 10);

        System.out.println(r1.equals(r2)); // prints "false"
        System.out.println(r1.equals(r3)); // prints "true"

        Object o1 = new rectangle(5, 10);
        Object o2 = new rectangle(15, 15);
        Object o3 = new square(15);

        System.out.println("Objects are identical: " + o1.equals(o2)); // prints "false"
        System.out.println("Objects are identical: " + o1.equals(r3)); // prints "true"
        System.out.println("Objects are identical: " + o2.equals(o3)); // prints "true"
    }
}





