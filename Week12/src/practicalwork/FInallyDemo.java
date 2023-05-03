package practicalwork;

public class FInallyDemo {
	
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

@SuppressWarnings("serial")
class ExceptionDemo1 extends Exception {}
@SuppressWarnings("serial")
class ExceptionDemo2 extends Exception {}
@SuppressWarnings("serial")
class ExceptionDemo3 extends Exception {}
@SuppressWarnings("serial")
class ExceptionDemo4 extends Exception {}