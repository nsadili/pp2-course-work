package Week09.PW;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Grades {
    private static Map<String, Double> gpa;

    public static void main(String[] args) {
        
        Map<String, Double> gpa = new LinkedHashMap<>();
        gpa.put("Leyla", 2.33);
        gpa.put("Malak", 2.00);
        gpa.put("Ulkar", 2.5);
       
        System.out.println(gpa);
        System.out.println(findMaxstudent(gpa));
        System.out.println(findAverage(gpa));
        System.out.println(numOfLessThanAverage(gpa));
        System.out.println("Print name of students with below average GPA:");
        var st = mapOfLessThanAverage(gpa);
        Iterator<String> it = st.keySet().iterator();

       while(it.hasNext()){
        var next = it.next();
        System.out.println(next + ": " + gpa.get(next));
       }

 
    }

    private static String gpaget(String next) {
        return null;
    }

    static Map<String, Double> findMaxstudent( Map<String, Double> grades){

      Map<String, Double> res= new LinkedHashMap<>();
      var max = Double.MIN_VALUE;
    for(var student : gpa.keySet()){
        if(gpa.get(student) >= max){
            max = gpa.get(student);
        }

      }

      for(var student : gpa.keySet()){
        if(gpa.get(student) == max){
            res.put(student, max);
        }

      }

      return res;


    }

    static double findAverage(Map<String, Double> gpa){

        var res=0.0;
        var lenght = gpa.size();

        for(var student : gpa.keySet()){
            res += gpa.get(student);
        }

        return res/lenght;

    }


    static int numOfLessThanAverage(Map<String, Double> gpa){

        var average = findAverage(gpa);
        var res =0;

        for(var student: gpa.entrySet()){
            if(student.getValue() < average)  res++;

        }

        return res;

    }

    static Map<String, Double> mapOfLessThanAverage(Map<String, Double> gpa){

        var average = findAverage(gpa);
        Map<String, Double> res = new TreeMap<>();

        for(var student: gpa.entrySet()){
            if(student.getValue() < average) res.put(student.getKey(), student.getValue());

        }

        return res;

    }
}