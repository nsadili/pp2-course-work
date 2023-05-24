package Week14;

import java.util.LinkedHashSet;

public class Main {

    private static final String Arrays = null;
    var list = Arrays.asList(3, 2, 4, 5, 2, 3);
    var set = new LinkedHashSet<>(list); 
    set.remove(2);
    var res = set.stream().mapToInt(e -> e).sum();
    System.out.println(res);
}
