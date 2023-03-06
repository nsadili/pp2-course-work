package Week06;

public class Segment implements Movable {
    private Point start;
    private Point end;
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

  
    
    public String toString(){
        return "Start: "+getStart()+", End: "+getEnd();
    }
    public boolean equals(Object obj){
        Segment seg=(Segment) obj;
        return this.start==seg.start&&this.end==seg.end;
    }


}
