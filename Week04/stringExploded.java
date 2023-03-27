public class stringExploded {
    String exploded(String s) {
        StringBuilder x = new StringBuilder() ;
        for(int i=1 ; i<=s.length(); i++) {
            x.append(s.substring(0,i)) ;
        }
        return x.toString() ;
    }
    public static void main(String[] args) {}
}
