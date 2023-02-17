public class Substring {
    public static void main(String[] args){
        String str = new String("Strings Is Amazing But ");
        String sub = new String("Amazing");
        System.out.println("Index of match: "+checkSub(str, sub));
    }

    static int checkSub(String str, String sub){
        int isSub = -1;
        int count = 0;
        for(int i=0;i<str.length();i++){
            isSub=i;
            for(int ii=0;ii<sub.length();ii++){
                if(str.charAt(i)==sub.charAt(ii)){
                    count++;
                    i++;
                }else{
                    count=0;
                    isSub=-1;
                    break;
                }
            }
            if(count==sub.length()){
                return isSub;
            }
        }
        
        return isSub;
    }
}
