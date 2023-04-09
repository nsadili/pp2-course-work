package class_pw;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Test<String, Integer> obj1 = new Test<>("a", 5);
        Test<String, Integer> obj2 = new Test<>("b", 2);
        Test<String, Integer> obj3 = new Test<>("c", 10);

        HashMap<String, Integer> hm = new HashMap<>();
        obj1.addToHashMap(hm);
        obj2.addToHashMap(hm);
        obj3.addToHashMap(hm);

        System.out.println(hm);
    }
}
