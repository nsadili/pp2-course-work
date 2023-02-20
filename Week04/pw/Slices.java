public class Slices {
    public static void main(String[] args) {
        String std1 = "NARIMAN";
        slicing(std1);
    }

    private static void slicing(String s){
        for (int i=1;i<s.length();i++){
            String a = s.substring(0,i);
            String b = s.substring(i);
            System.out.printf("%s %s\n", a,b);
        }
    }
}
