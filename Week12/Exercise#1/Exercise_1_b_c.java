public class Exercise_1_b_c {
    public static void main(String[] args) {
        try {
            testFinally();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    static void testFinally() throws Exception {
        try {
            throw new ExceptionDemo4();
        } finally {
            try {
                throw new ExceptionDemo3();
            } catch (Exception e) {
                System.out.println("An error occurred in the finally block: " + e.getMessage());
            }
        }
    }
}

class ExceptionDemo1 extends Exception {}
class ExceptionDemo2 extends Exception {}
class ExceptionDemo3 extends Exception {}
class ExceptionDemo4 extends Exception {}


/*
b) 

To fix the problems of the code there're two changigns what were applied:
1. Added a "try-catch" block inside the "finally" one from the code's method, so "ExceptionDemo3" will be caught 
and an error message will be printed 
2. Removed the "catch" block from "ExceptionDemo1", because it was not thrown in the "try" block

c) 

The out of the code is: 
An error occurred in the finally block: null
An error occurred: null

The output is lie that, because there're two exceptions, which are from finally block of code's method
and another is from main() method. (Consider that code's method means testFinally()). Both exceptions are caught, so
error messages are being printed, however, as messages are not associed with them, the respond is "null".

 */