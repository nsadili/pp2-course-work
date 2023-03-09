public class Segment implements Movable {
    private Point start, end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

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
