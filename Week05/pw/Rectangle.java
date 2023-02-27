public class Rectangle {
        private int width;
        private int height;
    
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Rectangle)) return false;
            Rectangle other = (Rectangle) obj;
            return this.width == other.width && this.height == other.height;
        }


        public static void main(String[] args){
        Rectangle r1 = new Rectangle(5, 10);

        Rectangle r2 = new Rectangle(15, 10);

        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2));// false
        System.out.println(r1.equals(r3)); // true
        }

    }
