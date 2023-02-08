package Week2;

public class RollingDie {
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("Roll die is not entered");
            System.exit(0);
        }

        int nbRolles = Integer.parseInt(args[0]);
        if(nbRolles < 1){
            System.out.println("It shoud be a positive number.");
            System.exit(0);
        }

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int p6 = 0;
        double n = Math.random();
        if(n < 0.125)
        p1++;
        else if(n < 0.25)
        p2++;
        else if(n < 0.375)
        p3++;
        else if(n < 0.5)
        p4++;
        else if(n < 0.75)
        p5++;
        else p6++;

        System.out.printf("%d time rolles happened.", nbRolles);
        System.out.println();
        System.out.printf("%d number of it is 1.", p1);
        System.out.println();
        System.out.printf("%d number of it is 2.", p2);
        System.out.println();
        System.out.printf("%d number of it is 3.", p3);
        System.out.println();
        System.out.printf("%d number of it is 4.", p4);
        System.out.println();
        System.out.printf("%d number of it is 5.", p5);
        System.out.println();
        System.out.printf("%d number of it is 6.", p6);
    }
}
