package Week05;

public class Ex11 {
    class Main {
        public static void main(String[] args) {
            Rectangle r1 = new Rectangle(5, 10);
            Rectangle r2 = new Rectangle(15, 10);
            Rectangle r3 = new Rectangle(5, 10);

    
            System.out.println(r1.equals(r2)); 
            System.out.println(r1.equals(r3)); 
  
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
}