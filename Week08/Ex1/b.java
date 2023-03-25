package Week08.Ex1;

    import java.util.ArrayList;
    import java.util.Iterator;
    import java.util.List;
    
    public class b {
    
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
    
            System.out.println(list.toString());
    
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
    
            for (int element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
    
            Iterator<Integer> it = list.iterator();
    
            while(it.hasNext()){
              System.out.print(it.next() + " ");
            }
            System.out.println();
        }
    }
