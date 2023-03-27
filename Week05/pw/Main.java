class X {
    public X() {
System.out.println("In constructor X."); }
}
class Y extends X {
    public Y() {
System.out.println("In constructor Y."); }
}
public class Main {
public static void main(String[] args) {
Y y = new Y(); }
}
//In constructor X will be output.
//In constructor Y will be output.
