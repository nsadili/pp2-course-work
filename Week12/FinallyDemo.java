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
        } catch (ExceptionDemo4 e) {
            System.out.println(e);
            throw new ExceptionDemo2(); 
        } finally {
            try {
                throw new ExceptionDemo3();
            } catch (ExceptionDemo3 e) {
                System.out.println(e);
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
