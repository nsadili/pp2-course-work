public class LambdaTester {
    static void printIt(AnyFunc<String> af) {
        System.out.println(af.func("Hello"));
    }

    static String upper(String a) {
        return a.toUpperCase();
    }

    String lower(String a) {
        return a.toLowerCase();
    }

    public static void main(String[] args) {
        printIt(LambdaTester::upper); // static M.R.
        LambdaTester lt = new LambdaTester();
        printIt(lt::lower); // instance M.R.
    }
}
