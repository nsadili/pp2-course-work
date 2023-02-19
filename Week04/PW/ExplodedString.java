public class ExplodedString {
    public static void main(String[] args) {
String s = "Baku";
System.out.println(exploded(s));
        
    }


    public static String exploded(String s){
        StringBuilder s1 = new StringBuilder("");

        for(int i = 1; i <= s.length(); i++){
            s1.append(s.substring(0, i));
        }

        return s1.toString();

    }
}

