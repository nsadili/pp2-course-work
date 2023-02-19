public class ExplodedString {

        public static void main(String[] args) {
            String str = "Baku";
            String exploded = explodeString(str);
            System.out.println(exploded);
        }
    
        public static String explodeString(String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                sb.append(repeatChar(c, i + 1));
            }
            return sb.toString();
        }
    
        public static String repeatChar(char c, int n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(c);
            }
            return sb.toString();
        }
    }
    
    
//B aa kkk uuuu
//BBaBakBaku ????