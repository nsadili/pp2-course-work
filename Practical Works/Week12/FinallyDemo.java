package Week12;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            testFinally();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void testFinally() throws ExceptionDemo2, ExceptionDemo3 {
        try {
            throw new ExceptionDemo4();
        } catch (ExceptionDemo4 e) {
            e.printStackTrace();
        } finally {
            try {
                throw new ExceptionDemo3();
            } catch (Exception e) {
                e.printStackTrace();
            }
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
