package Week04.Strings.pw;

import Week04.Strings.ex.SortingStrings;

public class Anagrams {
    boolean isAnagram(String s1, String s2) {
        SortingStrings ss = new SortingStrings();

        return ss.sort(s1).equals(ss.sort(s2));
    }

    public static void main(String[] args) {

        Anagrams an = new Anagrams();

        System.out.println(an.isAnagram("silent", "listen"));
        System.out.println(an.isAnagram("ata", "ana"));

    }
}
