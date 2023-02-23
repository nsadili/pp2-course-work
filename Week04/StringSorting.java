package Week04;

import java.util.Arrays;

public class StringSorting {
    public class SortString {
        public static String sortString(String str) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }
    }
