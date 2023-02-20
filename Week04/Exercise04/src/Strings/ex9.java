package Strings;

public class ex9 {
    public static void main(String args[]) {
        String a = "HGfgJfHGa";
        System.out.println(sortString(a));        
    }

    public static String sortString(String a) {
        char s[] = a.toCharArray();
        for (int i = 0; i < s.length - 1; i++)
            for (int j = i + 1; j < s.length; j++)
                if (s[i] > s[j]) {
                    char t = s[i];
                    s[i] = s[j];
                    s[j] = t;
                }

        return String.valueOf(s);
    }
}
