package pw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.xml.stream.events.StartDocument;

public class Grades {

    public static void main(String[] args) {
        TreeMap<String, Double> GPA = new TreeMap<>();
        GPA.put("Zarifa", 4.0);
        GPA.put("Amina", 3.12);
        GPA.put("Rahima", 3.67);
        GPA.put("Arzu", 3.98);
        GPA.put("Aziza", 4.0);
        highPerformance(GPA);
        System.out.println(averageGpa(GPA));
        System.out.println(lowerGpa(GPA));
    }

    static void highPerformance(Map<String, Double> gpa) {
        Double maxGpa = Double.valueOf(0);
        for (String s : gpa.keySet()) {
            if (gpa.get(s) >= maxGpa) {
                maxGpa = gpa.get(s);
            }
        }
        for (String s : gpa.keySet()) {
            if (gpa.get(s) == (double) maxGpa) {
                System.out.println(s + ":" + maxGpa);
            }

        }
    }

    static Double averageGpa(Map<String, Double> gpa) {
        Double sum = Double.valueOf(0);
        for (String student : gpa.keySet()) {
            sum += gpa.get(student);
        }
        Double res = sum / gpa.size();
        return res;
    }

    static int lowerGpa(Map<String, Double> gpa) {
        int res = 0;
        for (String student : gpa.keySet()) {
            if (averageGpa(gpa).compareTo(gpa.get(student)) > 0)
                res++;
        }
        return res;
    }
}
