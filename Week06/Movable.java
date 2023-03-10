package Week06;

import Week03.ex.geometry.Point;

public interface Movable {
    Movable moveUp(int steps);
    Movable moveDown(int steps);
    Movable moveLeft(int steps);
    Movable moveRight(int steps);

    public static void main(String[] args) {
        Point p1 = new Point(2,5);
        Point p2 = new Point(5,8);

        p1.moveUp(5).moveLeft(2);
        p2.moveUp(5).moveRight(2);

        System.out.println(p1);
        System.out.println(p2);
    }
}