public class SortString {
    public static String sortString(String str){
        char[] sb = str.toCharArray();
        int n = sb.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (sb[j] > sb[j+1]) {
                    char temp = sb[j];
                    sb[j] = sb[j+1];
                    sb[j+1] = temp;
                }
            }
        }

        return new String(sb); // == return sb.toString();
    }
}
