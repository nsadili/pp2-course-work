public class CoinTossing{
    public static void main(String[] args) {

        if(args.length<1){
            System.out.println("Please enter the number");
            return;
        }

        var num=Integer.valueOf(args[0]);
        double res;
        var tail=0;
        var head=0;
       for(int i=1;i<=num;i++){
         res= Math.random();


        if(res<0.5){
            System.out.println("Head");
            head++;
        }else{
            System.out.println("Tail");
            tail++;
        }
       }

       System.out.println("Number of Tails: "+tail + " Number Of Heads: " + head);
       System.out.printf("Probality of Tails: %.2f, Heads: %.2f",(double)tail/num ,(double) head/num);
    }
}