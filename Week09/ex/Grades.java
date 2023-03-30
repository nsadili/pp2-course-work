import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Grades {

    public static void main(String[] args) {

        Map<String, Double> students = new HashMap<>();

        students.put("Laman", 3.47);
        students.put("Vasila", 3.25);
        students.put("Shamil", 4.00);

        for (String st : students.keySet()) {
            System.out.println(st + " " + students.get(st));
           
        }

    //    while(it.hasNext()) {
    //     Object st = it.next();

    //     //Double value =  (Double) HashMap.get(it);
            
    //     }

        
    Iterator<String> it = students.keySet().iterator();
        double sum = 0;
        while(it.hasNext()) {

           

            String key = it.next();
          sum += students.get(key);

        //   System.out.println(sum);

        }
        System.out.println(sum / students.size());
    

       }

}
