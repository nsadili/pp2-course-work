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
            try{
                throw new ExceptionDemo3();
            }catch(Exception e){
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