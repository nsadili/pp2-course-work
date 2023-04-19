public class PW1 {
    public static void main (String[] args) {
        try {
            testFinally ();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void testFinally () throws Exception {
        try {
            throw new ExceptionDemo4 ();
        } catch (ExceptionDemo4 e) { // should change to demo4 because demo1 is not thrown in try block
            throw new ExceptionDemo2 ();
        } finally {
            // no exception throwing
        }
    }

    static class ExceptionDemo1 extends Exception {}
    static class ExceptionDemo2 extends Exception {}
    static class ExceptionDemo3 extends Exception {}
    static class ExceptionDemo4 extends Exception {}
    // should add "static" keyword to create an instance
}