interface AnyFunc1<T> {
    T func(T a, T b);

    public static void main(String[] args) {
        
        AnyFunc1<String> merge = (s1, s2) -> (s1 + " " + s2);
        String newText = merge.func("Hello", "World");
        System.out.println(newText);
    }
}
