public class ExplodedString {
    public static void main(String args[]) {
        String str="Baku";

        StringBuilder str2=new StringBuilder();
        
        for(int i=1;i<=str.length();i++) {
            for(int j=0;j<i;j++) {
                str2.append(str.charAt(j));
            }
        }
        System.out.println(str2);
    }
}