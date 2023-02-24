class TestClass {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        byte a = 5; short b = 10; int c = 15; float d = 20.1f; double e = 25.23;
        tc.run(a); tc.run(b); tc.run(c); tc.run(d); tc.run(e);
    }
    public void run(double d) {
        System.out.println("Double version: " + d);
    }
    public void run(int i) {
        System.out.println("Int version: " + i);
    }
    public void run(byte b) {
        System.out.println("Byte version: " + b);
    }


}