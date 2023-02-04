public class CoinTossing {
    public static void main(String[] args) {
        if (args.length<1) {
            System.out.print("Please enter the number: ");
            System.exit(1);
        }
        var numOfTrails = Integer.valueOf(args[0]);
        double res;
        long head=0;
        long tail=0;
        for (int i=1;i<=numOfTrails;i++) {
            res = Math.random();
           
            if (res<0.5)
            head++;
            else tail++;
    
            
    }
    System.out.printf("Head: %d/%d \nTail: %d/%d",head,head+tail,tail,tail+head);
}
}



