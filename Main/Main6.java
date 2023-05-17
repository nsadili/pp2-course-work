package Main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "monday");
        hm.put(2, "tuesday");
        hm.put(3, "wendesday");
        hm.put(16, "alleddum muvik muvik");

        hm.put(4, "thursday");
        hm.put(5, "friday");
        hm.put(6, "saturday");
        hm.put(7, "sunday");

        Set<Integer> keys = hm.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            String value = (String) hm.get(key);
            System.out.println(key + value);
        }

        System.out.println(hm.get(16));

        int[] intArr = { 5, -1, 2, 3, 55, 3, -5 };
        String[] strArr = { "Konul", "Sariyya", "Aydin", "Habil", "Natavan" };
        Arrays.sort(intArr);
        Arrays.sort(strArr);
        for (int i : intArr)
            System.out.print(i + " ");
        System.out.println();
        for (String s : strArr)
            System.out.println(s + " ");

        int[] intArr2 = { 5, -1, 2, 3, 55, 3, -5 };

        int idx = Arrays.binarySearch(intArr2, 55);
        System.out.println("Search result without sorting: " + idx);
        Arrays.sort(intArr2);
        idx = Arrays.binarySearch(intArr2, 55);
        System.out.println("Search result with sorting: " + idx);

        int[][] matrixOfOnes = new int[5][5];
        for (int[] row : matrixOfOnes)
            Arrays.fill(row, 1);
        for (int i = 0; i < matrixOfOnes.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrixOfOnes[i].length; j++)
                System.out.print(matrixOfOnes[i][j] + " ");
            System.out.println("|");
        }
    }

}
