import java.util.Scanner;

public class MixedString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String sen1 = sc.nextLine();
        String sen2 = sc.nextLine();

        sc.close(); 

        //System.out.println("reverse: "+ reverse("hello"));

        System.out.println("Sentence 1: "+ mix(sen1) );
        System.out.println("Sentence 2: "+ mix(sen2) );



    }
    
    public static String mix(String sen){
        String[] words = sen.split(" ");
        for (int i=0; i<words.length; i++){
            words[i] = reverse(words[i]);
        }

        //System.out.println(Arrays.toString(words));

        return String.join(" ", words);
       }

    public static String reverse(String word){
            char[] chword=word.toCharArray();
            int len=chword.length;
            char temp=chword[0];
            chword[0]=chword[len-1];
            chword[len-1]=temp;

            return new String(chword);
        }
    }
