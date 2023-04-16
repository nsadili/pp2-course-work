public class Rectangle {
    int width, height;
    public Rectangle(int w, int h) {
    width = w; 
    height = h;
    }
    public boolean equals(Object obj) {
    Rectangle rect = (Rectangle) obj;
    return (width == rect.width && height == rect.height);
    }
    }
    class Square extends Rectangle {
        public Square(int a) {
            super(a, a);
           this.height = a;
           this.width = a;
        }

    }