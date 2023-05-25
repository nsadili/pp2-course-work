package week12;


public class FinallyDemo {
    public static void main(String[] args) {
        try {
            testFinally();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void testFinally() throws Exception {
        
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