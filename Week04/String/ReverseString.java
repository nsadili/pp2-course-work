package Week4.String;

public class ReverseString {
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("Hello World");
        System.out.println(str.reverse());

        String str2 = "Hello World";
        for(int i=str2.length()-1; i>0; i--){
            System.out.print(str2.charAt(i));
        }
    }
    
}
