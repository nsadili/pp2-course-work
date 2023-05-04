public class StringReversed {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next(); // newxtLine()

        System.out.println(reverseV2(input));

    }

    static String reverseV1(String str){
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--){
            res += str.char.At(i);
        }
    }
    
    static String reverseV2(String str){

        char[] chars = str.toCharArray();

        int len = char.length;
        for (int i = 0; i < chars.length / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[len - 1 - i ];
            chars[len - 1 - i] = tmp;
        }
        
        return new String(chars);
    }
    

    static String reverseV3(String str){

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    static String reverseV3(String str){
        return new StringBuilder(str).reverse().toString();
    }

}