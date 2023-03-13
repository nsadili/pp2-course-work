public class Circle implements Movable {
    private Point center;
    private int radius;
    
    
    @Override
    public void moveUp() {
        center.moveUp();
    }
    
    @Override
    public void moveDown() {
        center.moveDown();
    }
    
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    
    @Override
    public void moveRight() {
        center.moveRight();
    }
}
