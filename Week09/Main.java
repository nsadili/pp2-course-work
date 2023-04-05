package Week09;
//import java.util.Scanner;

public class Main {
    public static void main() {
       LinkedHashMap<String, Integer> map= new LinkedHashMap<>();
       map.put("Ilaha Jamalli", 19);
       map.put("Nihat Ahmadli", 20);
       map.put("Inji Sadigli", 17);

for(String a: map.keySet()){
    System.out.println(map.get(a));
}

Iterator<String> m =map.keySet().iterator();
while(m.hashNext)   //

System.out.println(map.toString());

    }
}
