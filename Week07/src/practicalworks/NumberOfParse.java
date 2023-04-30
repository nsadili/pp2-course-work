package practicalworks;

import java.util.ArrayList;

import java.util.List;

public class NumberOfParse {
    public static void main(String[] args) {
    	
        String str = "";
        List<Integer> numbers = parseNumbers(str);
        System.out.println(numbers);
        
    }
    public static List<Integer> parseNumbers(String str) {
    	
        List<Integer> numbers = new ArrayList<>();
        
        String[] strNumbers = str.split(",");
        
        int i = 0;
        
        for (String s: strNumbers) {
            try {
                int num = Integer.parseInt(s.trim());
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.err.println("(" + s + ")" + " contain non-numeric values which get ignored. ");
            }
        }
        
        return numbers;
        
    }
}