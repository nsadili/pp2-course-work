public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(")");
        return sb.toString();
    }
    public class Segment {
        private Point p1;
        private Point p2;
        
        public Segment(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }
}

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(p1.toString());
        sb.append(", ");
        sb.append(p2.toString());
        sb.append("]");
        return sb.toString();
    }
}
