package PW;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Grades {
    public static void main(String[] args){
        HashMap<String, Double> gpa = new HashMap<>();
        gpa.put("islam", 2.9);
        gpa.put("nihat", 3.0);
        gpa.put("vusat", 3.15);
        gpa.put("resad", 2.27);

        //getting highest gpa
        Double highestGpa = 0.0;
        for(Map.Entry<String, Double> entry: gpa.entrySet()){
            if(entry.getValue() > highestGpa){
                highestGpa = entry.getValue();
            }
        }
        System.out.println("Highest gpa is: "+ highestGpa);


        //findingstudents with highest gpa
        ArrayList<String> studentsWithHighestGpa = new ArrayList<>();
        for(Map.Entry<String, Double> entry: gpa.entrySet()){
            if(entry.getValue() == highestGpa){
                studentsWithHighestGpa.add(entry.getKey());
            }
        }
        System.out.println(studentsWithHighestGpa);

        //finding avrg of gpa
        Double sum = 0.0;
        int count = 0;
        for(Map.Entry<String, Double> entry: gpa.entrySet()){
            sum += entry.getValue();
            count++;
        }
        Double avrg = sum/count;
        System.out.println("Averge of gpa: "+ avrg);

        //finding number of student who have less gpa than average
        count = 0;
        for(Map.Entry<String, Double> entry: gpa.entrySet()){
            if(entry.getValue() < avrg){
                count++;
            }
        }
        System.out.println("Number of student who has less gpa than average is: " + count);
    }
}
