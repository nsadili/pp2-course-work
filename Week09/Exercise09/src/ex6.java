import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        // a
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        scn.close();

        // b
        System.out.println("In non-descending order:");
        printAsNonDescending(input);
        System.out.println("\nIn non-ascending order:");
        printAsNonAscending(input);
    }

    public static void printAsNonDescending(String string) {
        int a[] = new int[26];
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        List<Integer> l = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            l = new LinkedList<>();

            for (int j = 0; j < string.length(); j++) {
                if ('a' + i == string.toLowerCase().toCharArray()[j]) {
                    a[i]++;
                    l.add(j);
                }
            }

            hm.put(i, l);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.println((char)('a' + i) + " " + hm.get(i));
            }
        }
    }

    public static void printAsNonAscending(String string) {
        int a[] = new int[26];
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        List<Integer> l = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            l = new LinkedList<>();

            for (int j = 0; j < string.length(); j++) {
                if ('a' + i == string.toLowerCase().toCharArray()[j]) {
                    a[i]++;
                    l.add(j);
                }
            }

            hm.put(i, l);
        }

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                System.out.println((char)('a' + i) + " " + hm.get(i));
            }
        }
    }
}
