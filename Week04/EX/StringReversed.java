public class StringReversed {
    public static void main(String[] args) throws Exception {
        String a = "1234";
        StringBuilder reversed =new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            reversed.append(a.charAt(i));
        }
        System.out.println(reversed.toString());
    
    }
}
