public class ReverseString {
    public static void main(String[] args) {
        String test = "sunset";      
        reverse(test);         
    }
    public static void reverse(String s){
     for(int i = s.length() - 1 ; i >= 0 ; i--) {
            System.out.print(s.charAt(i));
        }
    }
}