public static void moveObjects(Object[] objects, int dx, int dy) {
    for (Object obj : objects) {
        if (obj instanceof Movable) {
            Movable movable = (Movable) obj;
            movable.moveRight(dx);
            movable.moveDown(dy);
        }
    }
}
