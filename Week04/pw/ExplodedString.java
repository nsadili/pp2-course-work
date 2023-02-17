public class ExplodedString {
    public static void main(String[] args){
        String str = new String("Baku");
        System.out.println(explode(str));
    }

    static String explode(String str){
        String exploded = new String("");
        for(int i=0;i<str.length();i++){
                exploded = exploded.concat(str.substring(0, i+1));
        }
        return exploded;
    }
}
