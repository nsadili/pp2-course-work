public class Repeateddigit{
    public static void main(String [] args){
        int [] count = new int[10];
        int a = 24022023;
        while(a>0){
            count[a%10]++;
            a/=10;
        }
        int max = count[0];
        for(int i=0; i<count.length;i++){
            if(max<count[i]){
                max=count[i];
            }

        }
        System.out.println(indexOf(count,max));
    }
   
        public static int indexOf(int arr[], int element){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == element) return i;
            }
            
            return -1;
        }
    }
