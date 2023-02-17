public class StringReversed {
    public static void main (String args[]){
        String str = new String("Hello");//write string and it reverses
        System.out.println(reverse(str));
    }

    static String reverse(String str){
        String reversed = new String("");
        for(int i=str.length()-1;i>=0;i--){
            reversed = reversed.concat(Character.toString(str.charAt(i)));
        }
        return reversed;
    }
}
