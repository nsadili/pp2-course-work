package specProperties;

public class PalindromeProperty implements SpecificProperty<String> {
    
    @Override
    public boolean check(String obj) {

        return new StringBuilder(obj).reverse().toString().equals(obj);
    }

    // public static boolean check(String obj){

    //     return obj.equals(swapper(obj));
    // }

    // public static String swapper(String str){

    //     char []arr = str.toCharArray();
    //     int len = arr.length;
    //     for(int i = 0; i < len/2; i++){

    //         char tmp = arr[i];

    //         arr[i] = arr[len - 1- i];

    //         arr[len - 1- i] = tmp;
    //     }
    
    //     return new String(arr);
    // }
}
