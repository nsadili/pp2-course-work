/* a. The code has some typos, which will cause compile errors.

The try block in testFinally() method throws ExceptionDemo4.
The catch block is supposed to catch ExceptionDemo1, but since it's not the exception thrown, it won't be executed.
The finally block will always execute and will throw ExceptionDemo3.
So, the expected output will be a stack trace of ExceptionDemo3.
*/

public class main {
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
        } catch (ExceptionDemo4 e) {
            throw new ExceptionDemo2();
        } finally {
            throw new ExceptionDemo3();
        }
    }

    static class ExceptionDemo1 extends Exception {}
    static class ExceptionDemo2 extends Exception {}
    static class ExceptionDemo3 extends Exception {}
    static class ExceptionDemo4 extends Exception {}
}



/* c. The output should be a stack trace of ExceptionDemo3, as I explained in part a. */