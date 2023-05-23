package Week11;

public class Homework {
  public static void main (String args[]) {

    AnyFunc<String> func = t-> {

        char[] characters = t.toCharArray(); //toCharArray salam'i s, a, l, a, m, edir
        
        String res="";

        for (int i=characters.length-1; i>=0; i--) {
        
            res+=characters[i];
            // "" + m = "m"
            // "m" + a = "ma"
            // "ma" + l = "mal" etc
        }
        return res;
            };
        System.out.println(func.func("Salam"));

        
    }

  }  

