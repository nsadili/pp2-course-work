package Week12;

public class pw1 {
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
        } catch (ExceptionDemo4 e) { //ExceptionDemo1 to ExceptionDemo4 because ExceptionDemo4 only threwn in try
            throw new ExceptionDemo2();
        } finally {
            //unreachable code
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
