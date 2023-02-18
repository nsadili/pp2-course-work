public class MinMaxArray {
    public static void main(String[] args) {
        
        int Arr[]= new int[args.length];
        for(int i=0; i<args.length; i++){
            Arr[i]=Integer.parseInt(args[i]);
        }
        int cnt=0;
        int min=Arr[0],max=Arr[0];

        for(var i : Arr){
            if(min>Arr[cnt]) min = Arr[cnt];
            if(max<Arr[cnt]) max = Arr[cnt];
            cnt++;
        }
        System.out.println("min is "+min+", max is "+max);
    }
}
