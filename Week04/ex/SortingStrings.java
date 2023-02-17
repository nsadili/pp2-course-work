import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args){
        String str = new String("Hello, my name is islam.");
        System.out.println(sort(str));
    }

    static String sort(String str){
        char[] chars = str.toCharArray();
        int[] charCodes = new int[chars.length];
        for(int i=0;i<chars.length;i++){
            charCodes[i] = (int)chars[i];
        }
        Arrays.sort(charCodes);
        String sortedStr = new String("");
        for(int i=0;i<charCodes.length;i++){
            sortedStr = sortedStr.concat(Character.toString((char)charCodes[i]));
        }
        return sortedStr;
    }
}
