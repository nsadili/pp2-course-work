public class Slices {
    public static void main(String args[]) {
        String str="SITE";

        for(int i=1;i<str.length();i++) {
            System.out.print(str.substring(0, i));
            System.out.println(" "+str.substring(i,str.length()));

        }
    }
}