package Rectangle;

public class Rectangle {
        int width, height;
        
        public Rectangle(int w, int h) {
        width = w;
        height = h;
        }
        
        public int getWidth() {
                return width;
        }

        public int getHeight() {
                return height;
        }

        public boolean equals(Object obj) {
                if (obj==null) return false;
                if (!(obj instanceof Rectangle)) return false;
        Rectangle rect = (Rectangle) obj;
        return (this.width==rect.width) && (this.height==rect.height);
        }
}
