public class Point2 implements Movable {
    private int x;
    private int y;
    
    
    @Override
    public void moveUp() {
        y--;
    }
    
    @Override
    public void moveDown() {
        y++;
    }
    
    @Override
    public void moveLeft() {
        x--;
    }
    
    @Override
    public void moveRight() {
        x++;
    }
}
