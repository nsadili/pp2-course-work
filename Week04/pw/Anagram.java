public class Anagram {
    public static void main(String[] args){
        String str1 = new String("CustomWord1");
        String str2 = new String("word");

        System.out.println(checkAnagram(str2, str1));
    }

    //method checks anagram existence in both direction, method is not case sensitive 
    static boolean checkAnagram(String str1, String str2){
        int count1 = 0;
        int count2 = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        StringBuilder str1c = new StringBuilder(str1);
        StringBuilder str2c = new StringBuilder(str2);
        for(int i=0;i<str1c.length();i++){
            for(int ii=0;ii<str2c.length();ii++){
                if(str1c.charAt(i)==str2c.charAt(ii)){
                    count1++;
                    str1c.setCharAt(i, '0');
                }
            }}

            str1c = new StringBuilder(str1);
            str2c = new StringBuilder(str2);
            for(int i=0;i<str2c.length();i++){
                for(int ii=0;ii<str1c.length();ii++){
                    if(str2c.charAt(i)==str1c.charAt(ii)){
                        count2++;
                        str2c.setCharAt(i, '0');
                    }
                }
        }
        return count1==str1c.length() || count2==str2c.length();
    }
}
