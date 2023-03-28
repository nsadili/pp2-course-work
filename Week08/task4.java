import java.util.*;

public class task4 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        List<String> uniqueNames = new ArrayList<>(new LinkedHashSet<>(names));
       

        // Sort unique names in ascending order (optional)
        Collections.sort(uniqueNames);

    
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
