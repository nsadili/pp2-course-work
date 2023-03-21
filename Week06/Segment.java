public class Segment implements Cloneable, Movable {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "(" + this.start.toString() + ", " + this.end.toString() + ")";
    }

    @Override
    protected Segment clone() throws CloneNotSupportedException {
        Segment clone = (Segment) super.clone();
        clone.start = start.clone();
        clone.end = end.clone();
        return clone;
    }

    //Interface methods

    public void moveUp() {
        start.moveUp();
        end.moveUp();
      }
      
      public void moveDown() {
        start.moveDown();
        end.moveDown();
      }
      
      public void moveLeft() {
        start.moveLeft();
        end.moveLeft();
      }
      
      public void moveRight() {
        start.moveRight();
        end.moveRight();
      }
}

/*
 * We've implemented the clone() method for the
 * Segment class is a deep clone, because we're cloning the start and end points
 * as well as their internal data
 */