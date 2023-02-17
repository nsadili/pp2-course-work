public class SortString {
    public static void main(String[] args) {

        String s="FDCBA";
        System.out.println(sort(s));

    }

  private  static String sort(String s){

    char[] arr=s.toCharArray();

    for(var i=0;i<arr.length;i++){
        for(var j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
       }

       String res=new String(arr);
       return res ;
   





   }
}
