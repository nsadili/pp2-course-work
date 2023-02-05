public class CoinTossing {
    public static void main(String[] args) {
        if(args.length<1) {
        System.exit(1);
        }
        var nbOfTrails=Integer.valueOf(args[0]);
        double res;
        int cnt1=0;
        int cnt2=0;

        for(int i = 1; i<=nbOfTrails; i++) {
            res=Math.random();
            if(res<0.5) {
             System.out.println("Head");
             cnt1++;
            }

        else {
            System.out.println("Tail");
            cnt2++;
        }
    }
    System.out.println("Head: " +cnt1);
    System.out.println("Tail: " +cnt2);
}
}
