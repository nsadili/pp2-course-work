public class Rectangle {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 5);
        System.out.println(r.calcPerimeter());
        System.out.println(r.calcArea());
    }
        protected String name = "Rectangle";
        public int height, width;

        public Rectangle(int h, int w) {
        this.height = h; 
        this.width = w;
        }
        public int calcPerimeter() { 
        return 2 * (height + width);
        }
        public int calcArea() { 
        return height * width;
        }
        public void printName() { 
        System.out.println("I'm a "+name);
        }
        
        class Square extends Rectangle {
            public Square(int sideSize) {
            super(sideSize,sideSize);
            super.name = "Square";
            } 
            }
        
}
