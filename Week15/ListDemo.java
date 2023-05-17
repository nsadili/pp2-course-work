package Week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList(
            Arrays.asList("Nuraddin", "Shamil", "Elvin", "Sumaya"));

            var len = names.size();
            for (int i = 0; i < names.size(); i++) {
                if (names.get(i).startsWith("E"))
                    names.remove(i);
        }

        System.out.println(names);
    }
}
