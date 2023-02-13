package pp2.week03.geometry;

public class Point {

    private float x;
    private float y;

    public Point() {
        // EMPTY (DEFAULT) CONSTRUCTOR
        // this.x = 3;
        // this.y = 3;
        this(3,3);
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

        public void setY (float y) {
            this.y = y;
        }

        public void setX (float x) {
            this.x = x;
        }

        public void translate(float dX, float dY) {
            this.x +=dX;
            this.y +=dY;
        }

        public float distance(Point p) {

           float dist = (float) Math.sqrt( Math.pow(p.getX() - this.x, 2)
            +
            Math.pow(p.getY() - y, 2));

           // Math.hypot( Math.pow(p.getX() - this.x, 2),Math.pow(p.getY() - y, 2)));

            return dist;
        }

        public boolean equals(Point p) {
            return p.x == this.x && p.y == this.y;
        }
        
}