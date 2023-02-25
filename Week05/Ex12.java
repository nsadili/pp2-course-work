package Week05;

import Week05.Ex12.Main.Rectangle;

public class Ex12 {
    class Main {
        public static void main(String[] args) {
            Rectangle r1 = new Rectangle(5, 10);
            Rectangle r2 = new Rectangle(15, 10);
            Rectangle r3 = new Rectangle(5, 10);
            Object o1 = new Rectangle(5, 10);
            Object o2 = new Rectangle(15, 15);
            Object o3 = new Square(15);
    
            System.out.println(r1.equals(r2)); 
            System.out.println(r1.equals(r3)); 
            System.out.println("Objects are identitical:" + o1.equals(o2)); 
            System.out.println("Objects are identitical:" + o1.equals(o3)); 
            System.out.println("Objects are identitical:" + o2.equals(o3)); 
        }

    public static class Rectangle {
        private int width, height;
    
        public Rectangle(int w, int h) {
            this.width = w;
            this.height = h;
        }
    
        public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
            
                if (!(obj instanceof Rectangle)) {
                    return false;
                }
            
                Rectangle rect = (Rectangle) obj;
                return this.width == rect.width && this.height == rect.height;
            }
            
        
        }
        
    }
    public static class Square extends Rectangle {
        public Square(int side) {
            super(side, side);
        }
    }
}
