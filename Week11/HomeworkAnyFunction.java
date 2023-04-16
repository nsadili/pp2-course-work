package Week11;

public class HomeworkAnyFunction {
    public static void main(String[] args) {
        AnyFuction <String> func =  t-> {
            StringBuilder sb = new StringBuilder();
            sb.append(t);
            sb.reverse();
            return String.valueof(sb);
        }
    }
}
