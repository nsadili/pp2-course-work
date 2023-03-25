import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println(list.indexOf("B"));
        list.remove("B");
        System.out.println(list);

        list.forEach((n) -> System.out.println(n));
    }
    
}
