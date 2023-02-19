public class Anagrams {
    public static void main(String args[]) {
        String str="Baku";
        String str2="ukaB";
        System.out.println(Check(str, str2));
    }

    public static boolean Check(String str, String str2) {
        if(Reverse(str).toString().equals(str2)) return true;
        else return false;
        
    }

    public static StringBuilder Reverse(String str) {
        StringBuilder str2=new StringBuilder(str);
        return str2.reverse();
    } 
}