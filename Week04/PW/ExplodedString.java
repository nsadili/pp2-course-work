public class ExplodedString {
    public static void main(String[] args) throws Exception {
        String b="Baku";
        System.out.println(Exploaded(b));
        
    }
    public static String Exploaded(String b){
        StringBuilder exploded= new StringBuilder();
        for(int i=0;i<b.length();i++){
            exploded.append(b.charAt(i));
            exploded.append(b.substring(0, i+1));
        }
        return exploded.toString();
    }
}
