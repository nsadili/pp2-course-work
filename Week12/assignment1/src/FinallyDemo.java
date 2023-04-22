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
        } catch (ExceptionDemo4 e) { // ExceptionDemo1 should be change to ExceptionDemo1, because ExceptionDemo1
                                     // isn't in the try block
            throw new ExceptionDemo2();
        } finally {
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
} // we need to add static so it could be associated without an instance of
  // FinallyDemo
