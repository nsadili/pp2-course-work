package Week04;

public class substring {
    public static void main(String[] args) {
        System.out.println(checksub("Baku", "Bakuu"));
    }
    
    public static boolean checksub(String string, String sub) {
       if (string.indexOf(sub)>=0){
        return true;
       }
       return false;
    }
}
