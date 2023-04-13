package Week11;

public class AnyFuncHW {
    public static void main(String[] args) {
        AnyFunc<String> func = t -> {
            StringBuilder sb = new StringBuilder();
            sb.append(t);
            sb.reverse();
            return String.valueOf(sb);
        };
        System.out.println(func.func("Salam"));
    }
}