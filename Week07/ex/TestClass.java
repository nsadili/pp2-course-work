class TestClass {
    public static void main(String[] args) {
        try {
            int i = 5 / 0;
        } catch (ArithmeticException ae) {
        System.out.println("Error happened. Reason: "+ ae.toString());
        }
        System.out.println("Some other Operation");
    }
}