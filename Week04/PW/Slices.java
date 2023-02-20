public class Slices {
    public static void main(String[] args) throws Exception {
        String a= "SITE";
        sliced(a);
    }
    public static void sliced(String b){
        for(int i=1;i<b.length();i++){
            String out1= b.substring(0, i);
            String out2 = b.substring(i);
            System.out.printf("%s %s \n",out1,out2);
    }
        
    }
}
