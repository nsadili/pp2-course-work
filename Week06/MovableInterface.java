package Week06;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}



public class MovableInterface {
    public static void main(String[] args) {
        Movable[] movable = {new Point(1,1), new Segment(1,1,2,2), new Circle(new Point(1,1),3)};
        System.out.println("All the way up:");
        System.out.println();
        for(int i = 0; i < movable.length; i++) {
            System.out.println("Before:");
            System.out.println(movable[i]);
            movable[i].moveUp();
            System.out.println("After:");
            System.out.println(movable[i]);

            System.out.println();
        }
    }
}
