package Week04.pw16;

public class Point { 
        private double x;
        private double y;
        
        public Point() {
            this(0, 0);
        }
    
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void setPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getX() {
            return this.x;
        }
    
        public double getY() {
            return this.y;
        }
    
        public void translate(double dx, double dy) {
            this.x += dx;
            this.y += dy;
        }
    
        public double distance(Point p) {
            return (double) Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
        }
    
    }

