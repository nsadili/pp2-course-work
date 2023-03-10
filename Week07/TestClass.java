public class TestClass {
    public static void main(String[] args) {
        try{
            int i = 5 / 0;
        }catch(NullPointerException ae){
            System.out.println(ae.toString());
            //return "aa";
        }
        finally{
            System.out.println("Other operations");
        }
    }
}