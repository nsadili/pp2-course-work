public class Point {
        private float x;
        private float y;
    
        public Point() {
    
        }
    
        public Point(float x, float y) {
    
            this.x = x;
            this.y = y;
    
        }
    
        public float getX() {
            return this.x;
        }
    
        public float getY() {
            return this.y;
        }
    
        public void translate(float dX, float dY) {
            this.x += dX;
            this.y += dY;
        }
    
        public float distance(Point p) {
            float dist = (float) Math.sqrt(
                    Math.pow(this.x - p.x, 2)
                            + Math.pow(this.y - p.y, 2));
    
            return dist;
        }
    
        public void setX(float x) {
            this.x = x;
        }
    
        public void setY(float y) {
            this.y = y;
        }
    
        public String toString() {
            return "(" + this.x + ", " + this.y + ")";
        }
    
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Point)) return false;
            Point other = (Point) obj;
            return Float.compare(this.x, other.x) == 0 &&
                   Float.compare(this.y, other.y) == 0;
        }
    }
    

