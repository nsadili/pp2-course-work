package Week09;

import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Map<String,Double> gpa=new LinkedHashMap<String,Double>();

        gpa.put("Nuraddin", 2.27);
        gpa.put("Rufiz", 3.4);
        gpa.put("Taghi", 1.0);
        gpa.put("Nulifer", 4.0);
        gpa.put("Urod", 4.0); 


        System.out.println(gpa);

        List<String> topStudents=new ArrayList<String>(); 
        for(String name: gpa.keySet()) {
            if(gpa.get(name)==highestGpa(gpa)) topStudents.add(name);
            System.out.println(topStudents.toString());
        }

        System.out.println(topStudents.toString());

        Double totalGpa=0.0;
        for(String name: gpa.keySet()) {
            totalGpa+=gpa.get(name);
        }
        
        Double averageGpa=totalGpa/gpa.keySet().size();
        System.out.println(averageGpa);

        int lessGpa=0;
        for(String name: gpa.keySet()) {
            if(gpa.get(name)<averageGpa) lessGpa++;
        }

        System.out.println(lessGpa);

    } 

    static Double highestGpa(Map<String,Double> grade) {
        Double hGpa=0.0;
        for(String name: grade.keySet()) {
            if(grade.get(name)>=hGpa) hGpa=grade.get(name);
        }
        return hGpa;
    }
}
