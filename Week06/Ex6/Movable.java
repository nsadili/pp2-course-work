package Week06.Ex6;

public interface Movable {
    Movable moveUp(int steps);

    Movable moveDown(int steps);

    Movable moveLeft(int steps);

    Movable moveRight(int steps);
}