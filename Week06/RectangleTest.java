public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = null;

        try {
            rect2 = rect1.clone();
        } catch (CloneNotSupportedException a) {
            a.printStackTrace();
        }
        System.out.println("Rect1 width: " + rect1.getA());
        System.out.println("Rect2 width: " + rect2.getB());
    }
}
/*
 * A/
 * The clone() method in the Object class has protected visibility because it is
 * intended to be overridden by subclasses, but not directly called by client
 * code. The method is intended to provide a way for objects to create copies of
 * themselves, but it should only be called by the object's own class or a
 * subclass.
 * B/
 * In general, it is best to keep the clone() method protected in extending
 * classes, unless there is a specific need to make it public. When the clone()
 * method is made public, it allows any code to clone the object, which can lead
 * to unintended side effects or security issues. However, there may be cases
 * where it is necessary to make the clone() method public, such as when the
 * class is intended to be used in a library or API that requires cloning
 * functionality. In these cases, it is important to carefully document the
 * behavior of the clone() method and any assumptions or requirements for using
 * it correctly.
 */
