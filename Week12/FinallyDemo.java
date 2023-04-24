// There is a syntax error in the catch block, where ExceptionDemo1() is used instead of ExceptionDemo1. 
// This will result in a compilation error.

// In the try block, you're throwing an instance of ExceptionDemo4, which is not a subclass of ExceptionDemo1.
// As a result, it's impossible for the catch block for ExceptionDemo1 to ever be executed.

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
            throw new ExceptionDemo1();
        } catch (ExceptionDemo1 e) {
            throw new ExceptionDemo2();
        } finally {
            throw new ExceptionDemo3();
        }
    }
}

class ExceptionDemo1 extends Exception {}
class ExceptionDemo2 extends Exception {}
class ExceptionDemo3 extends Exception {}
class ExceptionDemo4 extends Exception {}

// When this code is executed, the output will be:
//      Exception in thread "main" ExceptionDemo3
//           at FinallyDemo.testFinally(FinallyDemo.java:21)
//           at FinallyDemo.main(FinallyDemo.java:10)
// This is because the finally block always executes, even if an exception is thrown in the try block. 
// In this case, an exception of type ExceptionDemo3 is thrown in the finally block, 
// which is then propagated up to the main() method where it is printed to the console.
