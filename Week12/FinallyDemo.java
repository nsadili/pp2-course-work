// public class FinallyDemo{
//     public static void main(String[] args) {
//         try{
//             testFinally();
//         } catch (Exception e) {
//             e.printStackTrace ();
//         }
//     }

// static void testFinally() throws Exception{
//     try {
//         throw new ExceptionDemo4();
//     }catch (ExceptionDemo1 e) { 
//         throw new ExceptionDemo2 ();
//     }finally { 
//         throw new ExceptionDemo3();
//         }
//     }
// }
// class ExceptionDemo1 extends Exception {}

// class ExceptionDemo2 extends Exception {}

// class ExceptionDemo3 extends Exception {}

// class ExceptionDemo4 extends Exception {}

// Unreachable catch block for ExceptionDemo1. This exception is never thrown from the try statement body.
// This is because the try block within testFinally() only throws ExceptionDemo4 objects, and not ExceptionDemo1 objects.

// Fixed code:

public class FinallyDemo{
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
}

class ExceptionDemo1 extends Exception {}

class ExceptionDemo2 extends Exception {}

class ExceptionDemo3 extends Exception {}

class ExceptionDemo4 extends Exception {}


// The finally block always executes, regardless of whether an exception is thrown or not. 
// In this case, the finally block throws an ExceptionDemo3 object, which is propagated up the call stack and caught in the main() method's catch block. 