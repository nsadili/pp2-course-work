public class Substring {
    public static void main(String args[]) {
        String str="Kukushka";
        String str2="kush";
        System.out.println(Sub(str,str2));
    }

    public static boolean Sub(String str,String str2) {
        for(int i=0;i<str.length()-str2.length()+1;i++) {
            if(str.substring(i, i+str2.length()).equals(str2)) return true;
        }
        return false;
    }
}