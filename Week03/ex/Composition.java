class Segment {
    Point p1;
    Point p2;

    Segment(float x1, float y1, 
            float x2, float y2) {
                this.p1 = new Point(x1, y1);
                this.p2 = new Point(x2, y2);
            }

}

class Composition {
    public static void main(String[] args) {
        int a[][] = { {1, 2}, {3, 4}, {5, 6} };
System.out.println(a.length); // 3
System.out.println(a[0].length);
    }
}