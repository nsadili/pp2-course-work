public class explode {
    public static void findExploded(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(str.charAt(j));
            }
        }
    }
}
