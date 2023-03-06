public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {

    }

    public static void moveAllPoints(Movable[] arr, int steps) {

        int choice = 1; 

        for (Movable m : arr) {
            switch (choice) {
                case 1:
                    m.moveUp(steps);
                    break;

                case 2:
                    m.moveDown(steps);
                    break;

                case 3:
                    m.moveRight(steps);
                    break;

                case 4:
                    m.moveLeft(steps);
                    break;

            }
        }

    }
}