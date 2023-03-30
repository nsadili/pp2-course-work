class Point {
    float x;
    float y;

Point(float x, float y) {
    this.x = x;
    this.y = y;
    }
}

class Segment {
    Point p1;
    Point p2;

    Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}