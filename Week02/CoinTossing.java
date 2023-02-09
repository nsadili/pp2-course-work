public class CoinTossing{
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Please enter the value");
            System.exit(1);
        }
        var n = Integer.parseInt(args[0]);
        int cnt1 = 0, cnt2 = 0;
        //Integer.valueOf(args[0]);
         while(n>0){
            var res = Math.random();
         if(res < 0.5){
             cnt1++;
         }
         else{
             cnt2++;
         }
         n--;
         }
         System.out.println("Head: " + cnt1);
         System.out.println("Tail: " + cnt2);
    }
}