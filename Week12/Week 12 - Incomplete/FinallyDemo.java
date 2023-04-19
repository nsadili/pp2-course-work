public class FinallyDemo {
    public static void main(String[] args) {
        try {
            testFinally();
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getClass().getName());
        }
    }

    static void testFinally() throws Exception {
        try {
            throw new ExceptionDemo4();
        } catch (ExceptionDemo4 e) {
            throw new ExceptionDemo2();
            // System.out.println("In catch");
        } finally {
            // System.out.println("finally");
            throw new ExceptionDemo3();
           
        }
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
