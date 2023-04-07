package EX4;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int count = Util.count(list, new EvenIntegerProperty());
        System.out.println(count);
    }
}
