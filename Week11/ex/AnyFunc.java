interface AnyFunc<T> {
    T func(T t);

    public static void main(String[] args) {
        AnyFunc<String> upper = (s) -> s.toUpperCase();
        String newText = upper.func("Demo");
        System.out.println(newText);

    }
}
