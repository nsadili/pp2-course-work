    import java.util.*;

    public class example {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
    
            list.add(10);
            list.add(20);
            list.add(30);
    
            System.out.println("Using toString() method:");
            System.out.println(list.toString());
    
            System.out.println("Using for statement:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("Using enhanced for statement:");
            for (int element : list) {
                System.out.println(element);
            }
            System.out.println("Using iterator:");
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }