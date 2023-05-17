package Week12;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            testFinally();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void testFinally() throws Exception {
        try {
            throw new ExceptionDemo4();
        } finally {
            throw new ExceptionDemo3();
        }
    }

    static class ExceptionDemo1 extends Exception {
    }

    static class ExceptionDemo2 extends Exception {
    }

    static class ExceptionDemo3 extends Exception {
    }

    static class ExceptionDemo4 extends Exception {
    }
}
