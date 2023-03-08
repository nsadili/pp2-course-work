import java.lang.Math;

public class Pointt {
    public float x;
    public float y;

    public void Circle() {

    }

    public void Circle(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }
    
    public void Circle(Circle p) {
        this.x = p.x;
        this.y = p.y;
    }

    

    public void setX(int x) {
        this.x = x;
    }

    public void moveUp() {
        this.y++;
    }

    public void moveDown() {
        this.y--;
    }
    
    
    public float getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    

    public void moveLeft() {
        this.x--;
    }

    public void moveRight() {
        this.x++;
    }

    public float distance(Circle p) {
        return (float) Math.sqrt(Math.abs((p.x - this.x)) * Math.abs((p.x - this.x))
                + Math.abs((p.y - this.y)) * Math.abs((p.y - this.y)));
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { 
            return true;
        }
        if (!(obj instanceof Circle)) { 
            return false;
        }
        Circle other = (Circle) obj; 
        return this.x == other.x && this.y == other.y;
    }

    @Override
    protected Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (Exception e) {
            return new Circle(this.x, this.y);
        }
    }
}