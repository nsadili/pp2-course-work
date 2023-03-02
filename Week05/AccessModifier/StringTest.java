package AccessModifier;
import AccessModifier.AccessMod.AccessClass;

public class StringTest {
    public static void main(String[] args) {

        AccessClass ac = new AccessClass();

        System.out.println("a = " + ac.a);
        // The following line will cause a compilation error because b is private
        // System.out.println("b = " + ac.b);
        System.out.println("c = " + ac.c);
    }
}
