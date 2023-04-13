interface anyFunc<T>{
    T func(T s);
}
interface anyFunc1<T>{
    T func(T s);
}
public class Homework {
    public static void main(String[] args) {
        anyFunc<String> a = s -> {
            return new StringBuilder(s).reverse().toString();
        };
        anyFunc1<Integer> b = s -> {
            String c = Integer.toString(s);
            int cnt = c.length();
            return cnt;
        };
        System.out.println(a.func("Salam"));
        System.out.println(b.func(12345));
    }
}
