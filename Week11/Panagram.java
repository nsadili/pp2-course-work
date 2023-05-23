package Week11;

public class Panagram {

    /**
     * @param args
     */
    public static void main(String args[]) {

        String letters = new String();
    
    for (int i = 0; i < letters.length(); i++) {

        int c = letters.length();

        int index = Character.toLowerCase(c) - 'a';

        if (index >= 0 && index <= 26) {

           System.out.println("It is a panagram");        }

            else 
                
            System.out.println("It is not a panagram");
    }

 }

}