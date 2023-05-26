public class Substring {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Enter 2 strings");
            System.exit(1);
        }
        String str1 = args[0];
        String str2 = args[1];
        int index = substring(str1, str2);
        if (index == -1)
            System.out.println("2nd string is not substring of 1st");
        else
            System.out.println("index of substring is " + index);
    }

    static int substring(String str1, String str2) {
        int str1Len = str1.length();
        int str2Len = str2.length();

        for (int i = 0; i <= str1Len - str2Len; i++) {
            int j;
            for (j = 0; j < str2Len; j++) {
                if (str1.charAt(i + j) != str2.charAt(j))
                    break;
            }
            if (j == str2Len)
            return i;
        }
        return -1;
    }
}
