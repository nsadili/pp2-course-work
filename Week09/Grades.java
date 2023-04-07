import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.text.html.parser.Entity;

public class Grades {
    public static void main(String[] args) {
        
        Map<String, Double> grades = new LinkedHashMap<>();

        
        grades.put("Behruz", 2.0);
        grades.put("Ayla", 4.0);
        grades.put("Nezrin", 3.5);
        grades.put("Aydin", 3.6);
        grades.put("Arzu", 4.0);
        grades.put("Fidan", 2.1);
        grades.put("Nigar", 3.4);
        grades.put("Gulsen", 4.0);
        grades.put("Sahil", 3.0);
      
        


        System.out.println(grades);

        System.out.println(findMaxstudent(grades));
        System.out.println(findAverage(grades));
        System.out.println(numOfLessThanAverage(grades));

        System.out.println("Print students whose gpa less than average");

        var st = mapOfLessThanAverage(grades);
        Iterator<String> it = st.keySet().iterator();

       while(it.hasNext()){
        var next = it.next();
        System.out.println(next + ";" + grades.get(next));
       }

 
    }

    static Map<String, Double> findMaxstudent( Map<String, Double> grades){

      Map<String, Double> res= new LinkedHashMap<>();
      var max = Double.MIN_VALUE;
      for(var student : grades.keySet()){
        if(grades.get(student) >= max){
            max = grades.get(student);
        }

      }

      for(var student : grades.keySet()){
        if(grades.get(student) == max){
            res.put(student, max);
        }

      }

      return res;


    }

    static double findAverage(Map<String, Double> grades){

        var sum=0.0;
        var lenght = grades.size();

        for(var student : grades.keySet()){
            sum += grades.get(student);
        }

        return sum/lenght;

    }


    static int numOfLessThanAverage(Map<String, Double> grades){

        var average = findAverage(grades);
        var num =0;

        for(var student: grades.entrySet()){
            if(student.getValue() < average)  num++;

        }

        return num;

    }

    static Map<String, Double> mapOfLessThanAverage(Map<String, Double> grades){

        var average = findAverage(grades);
        Map<String, Double> res = new TreeMap<>();

        for(var student: grades.entrySet()){
            if(student.getValue() < average) res.put(student.getKey(), student.getValue());

        }

        return res;

    }
}