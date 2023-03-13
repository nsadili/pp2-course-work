/*
    a. The clone() method is used to create a copy of an object,
    and the implementation of the clone() method needs to be carefully
    designed to ensure that the cloned object is functionally equivalent
    to the original object. Allowing direct access to the clone()
    method from another code could result in incorrect use and
    modification of the cloned object.

    b. Keeping the clone() method protected in an extending class provides several benefits:
        1. Control over how the object is cloned
        2. Protection of sensitive data
        3. Encapsulation of implementation details

    You must use public instead of protected when you want to allow
    all classes, including those outside of the current package and
    its subclasses, to access a method or field.

    In summary, use public when you want to expose a method or field
    to all classes, and use protected when you want to limit access
    to the current package or its subclasses for encapsulation
    and control.
 */
public class Problem4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 15);
        Object o1 = r1.clone();
        System.out.println(o1.toString());
    }
}
