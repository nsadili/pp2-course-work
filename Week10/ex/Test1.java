public class Test1 {
    class A<T> {
        public void doIt(T... values) {
            for (T x : values)
                System.out.println(x);
        }
    }

    public class Test {
        public static void main(String[] args) {
            A<Integer> a = new A<Integer>();
            a.doIt(1, 2, 3);
            a.doIt(1, 2, 3, 4, 5, 6, 7);
        }
    }
}
