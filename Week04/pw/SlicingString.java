public class SlicingString {
    public static void main(String[] args){
        String str = new String("ThisIsString");
        slice(str);
    }

    static void slice(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.substring(0,i)+" "+str.substring(i,str.length()));
        }
    }
}
