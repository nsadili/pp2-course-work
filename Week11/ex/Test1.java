interface Test {
    boolean isEven(int n);

    Test t = (n) -> (n % 2) == 0;

    public static void main(String[] args) {
        System.out.println(t.isEven(5));
        System.out.println(t.isEven(6));
    }

}
