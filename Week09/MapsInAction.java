package Week09;

import java.util.Comparator;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapsInAction {
    public static void main(String[] args) {

        
        Map<String, Integer> ages = new TreeMap<>(new Comparator<String>() {

            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });


        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            String s = input.next();
            Integer n = input.nextInt();
            ages.put(s, n);
        }

     
        System.out.println(ages.entrySet());

        for(Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        input.close();
    }
}