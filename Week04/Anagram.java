package Week04;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int[] counts = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
            counts[s2.charAt(i) - 'a']--;
        }
        
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
   
        public static void main(String[] args) {
            String s1 = "listen";
            String s2 = "silent";
            boolean result = areAnagrams(s1, s2);
            System.out.println(result);
        }
    }
    

