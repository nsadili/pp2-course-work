package Week06.Ex01;

public interface Movable {
    void translate(float dX, float dY);
    Movable moveUp(int steps);
    Movable moveDown(int steps);
    Movable modeLeft(int steps);
    Movable moveRight(int steps);

}
