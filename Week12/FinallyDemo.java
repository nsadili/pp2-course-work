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
            throw new Exception("Exception inside try block");
        } catch (Exception e) {
            throw new Exception("Exception inside catch block", e);
        } finally {
            throw new Exception("Exception inside finally block");
        }
    }
}