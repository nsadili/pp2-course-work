public class Segment3 implements Movable {
    private Point startPoint;
    private Point endPoint;
    
    
    @Override
    public void moveUp() {
        startPoint.moveUp();
        endPoint.moveUp();
    }
    
    @Override
    public void moveDown() {
        startPoint.moveDown();
        endPoint.moveDown();
    }
    
    @Override
    public void moveLeft() {
        startPoint.moveLeft();
        endPoint.moveLeft();
    }
    
    @Override
    public void moveRight() {
        startPoint.moveRight();
        endPoint.moveRight();
    }
}
