import java.util.*;
public class Grades {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();
        grades.put("Narmina", 4.0); 
        grades.put("Fakhri", 3.5); 
        grades.put("Jeyla", 3.0); 
        grades.put("Fuad", 2.0);

        System.out.println(grades);
        System.out.println(findMaxstudent(grades));
        System.out.println(findAverage(grades));
        System.out.println(numOfLessThanAverage(grades));
        
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


