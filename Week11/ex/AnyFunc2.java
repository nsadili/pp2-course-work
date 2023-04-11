interface AnyFunc2 <T, S, U> {
    T func(S a, U b);

    public static void main(String[] args) {
        AnyFunc2<String, String, Integer> merge = (s1, s2) -> s1 + " : " + s2;
        String result = merge.func("Hello", 5);
        System.out.println(result);
    }
}
