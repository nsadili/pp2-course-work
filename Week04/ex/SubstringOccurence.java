import java.util.Scanner;

public class SubstringOccurence {
    public static void main(String[] args) {
        System.out.println("Please enter first input: ");
        Scanner sc=new Scanner(System.in);
        var s=sc.nextLine();
        System.out.println("Please enter second input: ");
        var s2=sc.nextLine();
        
        System.out.println("The number of substrings: " + subString(s, s2));

    }

    public static int subString(String s1, String s2) {
        var count = 0;
        var sub = "";
      //  int l= (s1.length()<s2.length()) ? s1.length():s2.length();
       // System.out.println(l);
        for (var i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            sub="";
            if (s1.charAt(i) == s2.charAt(i)) {
               // var j = i;
               
               while (i < Math.min(s1.length(), s2.length()) && s1.charAt(i) == s2.charAt(i))
               {
                    sub += s1.charAt(i);
                    i++;
                }
                count++;
                System.out.println(sub);
            }
           
          

        }

        return count;

    }
}
