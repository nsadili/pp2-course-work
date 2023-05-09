package Week12;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            testFinally();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    With the initial form of this code given in exercises it will not run
    because try block never throws ExceptionDemo1.
     */
    static void testFinally() throws Exception {
        try {
            throw new ExceptionDemo4();
        }
        catch (ExceptionDemo4 e){
            System.out.println(e);
        }
//        catch (ExceptionDemo1 e) {
//            throw new ExceptionDemo2();
//        }
         /*
         When we comment catch part it seems like problem is solved but, it is not.
         That is because finally block cannot be executed properly because it tries
         to throw exception on finally block. If we add "try catch" block inside finally
         the problem with finally block will be solved. However, first try block will
         also cause problem because there must be catch method for ExceptionDemo4.
         In the end the code will look like it does now.
         If we run it, it will output as follows:
         Week12.ExceptionDemo4
         Week12.ExceptionDemo3
         */
        finally {
            try {
                throw new ExceptionDemo3();
            } catch (ExceptionDemo3 e){
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