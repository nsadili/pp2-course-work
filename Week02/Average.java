public class Average {
    public static void main(String[] args){
        int c, sum, n;
        c = sum = 0;

        if(args.length == 0) System.out.println("Please enter numbers");
        else{
            for(int i = 0; i < args.length; i++){
                n = Integer.parseInt(args[i]);
                sum += n;
                c++;
            }
        }
        
        System.out.println("average: " + sum / c);
    }
}
