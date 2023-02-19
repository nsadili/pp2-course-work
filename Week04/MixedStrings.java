public class MixedStrings {
    public static void main(String args[]) {
        String sen="This is PP2 Spring 2023";
        
        String[] str=sen.split(" ");
        System.out.println(Reverse(str).toString());
    }

    public static StringBuilder Reverse(String[] str) {
        char last,first;
        StringBuilder str2= new StringBuilder();
        
        for(int i=0;i<str.length;i++) {
            str2.append(str[i].charAt(str[i].length()-1));
            for(int j=1;j<str[i].length()-1;j++) {
                str2.append(str[i].charAt(j));
            }
            str2.append(str[i].charAt(0));
            str2.append(" ");
        }
        return str2;
    }
}