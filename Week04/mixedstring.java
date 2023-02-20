package Week04;

public class mixedstring {

    public static void main(String[] args) {
        String s = "baku is capital city"; 
        String result[] = s.split(" ", 0);
       
        for (int i = 0; i < result.length; i++) {
            char c[] = result[i].toCharArray();
            char temp = c[0];
            c[0] = c[result[i].length()-1];
            c[result[i].length()-1] = temp;
            System.out.print(c);
            System.out.print(" ");//uakb si lapitac yitc
        }
    }
}

