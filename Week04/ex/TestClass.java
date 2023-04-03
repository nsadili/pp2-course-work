public class TestClass {
    public void run(double d) { System.out.println(“Double version: “ + d); }
    public void run(int i) { System.out.println(“Int version: “ + i); }
    public void run(byte b) { System.out.println(“Byte version: “ + b); }
    public static void main() { TestClass tc = new TestClass();
    byte a = 5; short b = 10; int c = 15;
    tc.run(a); tc.run(b); tc.run(c);
    } }
    float d = 20.1f; tc.run(d);
    double e = 25.23; tc.run(e);