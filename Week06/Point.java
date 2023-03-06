package Week06;

public class Point implements Movable {
    private float x;
    private float y;
    
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
    public void translate(float dx, float dy) {
        x += dx;
        y += dy;
    }
    
    public float distance(Point other) {
        float dx = other.x - x;
        float dy = other.y - y;
        return (float) Math.sqrt(dx*dx + dy*dy);
    }
    
    public boolean equals(Point other) {
        return x == other.x && y == other.y;
    }
    
    public void moveUp() {
        y -= 1;
    }
    
    public void moveDown() {
        y += 1;
    }
    
    public void moveLeft() {
        x -= 1;
    }
    
    public void moveRight() {
        x += 1;
    }
    
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

