package Week05.PW;

public class Rectangle {
        private int width;
        private int height;
    
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
    
        public int getWidth() {
            return width;
        }
    
        public void setWidth(int width) {
            this.width = width;
        }
    
        public int getHeight() {
            return height;
        }
    
        public void setHeight(int height) {
            this.height = height;
        }
        public boolean equals(Object obj){

            Rectangle rect= (Rectangle) obj;
    
            return rect.width==this.width && rect.height==this.height;
    
        }
    
        public static void main(String[] args) {
            Rectangle r1=new Rectangle(5, 10);
            Rectangle r2=new Rectangle(15, 10);
            Rectangle r3=new Rectangle(5, 10);
    
            System.out.println(r1.equals(r2));
            System.out.println(r1.equals(r3));
    
    
        }
    

