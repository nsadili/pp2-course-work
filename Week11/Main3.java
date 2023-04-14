import java.io.*;
 
class Panagram{

    public static boolean checkPangram(String str)
    {
   
        boolean[] a = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            
            if ('A' <= str.charAt(i)
                && str.charAt(i) <= 'Z')
                i = str.charAt(i) - 'A';
      
            else if ('a' <= str.charAt(i)
                     && str.charAt(i) <= 'z')
 
                i = str.charAt(i) - 'a';
 
            else
            a[i] = true;
        }

        
        for (int i = 0; i < 26; i++)
            if (a[i] == false) 
            return (false);

            return (true);
  
        }

    
 

    public static void main(String[] args)
    {
        String str
            = " Gulnar ";
 
        if (checkPangram(str) == true)
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str + " is not a pangram.");
    }
}


