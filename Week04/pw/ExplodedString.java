public class ExplodedString {
    private String originalString;

    public ExplodedString(String originalString) {
        this.originalString = originalString;
    }

    public String getExplodedString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < originalString.length(); i++) {
            for (int j = 0; j <= i; j++) {
                sb.append(originalString.charAt(j));
            }
        }
        return sb.toString();
    }

public static void main(String [] args){
    ExplodedString explodedString = new ExplodedString("Baku");
String result = explodedString.getExplodedString();
System.out.println(result); // Output: BBaBakBaku
}
}