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
            // System.out.println("Checking-->try");
            throw new ExceptionDemo4();// if try block throw ExceptionDemo4 that
            // catch block should catch that type of exception
        } catch (ExceptionDemo4 e) {
            // System.out.println("Checking-->catch");
            throw new ExceptionDemo2();
        } finally {
            // System.out.println("Checking-->finally");
            throw new ExceptionDemo3();
        } // exception in finally overwrited exception catching process in catch block
    }
}

class ExceptionDemo1 extends Exception {
}

class ExceptionDemo2 extends Exception {
}

class ExceptionDemo3 extends Exception {
}

class ExceptionDemo4 extends Exception {
}
