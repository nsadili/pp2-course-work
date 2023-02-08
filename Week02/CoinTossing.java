package Week2;
import java.lang.Math;
public class CoinTossing {
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("You shoud enter a number");
            System.exit(0);
        }
        int tosses = Integer.parseInt(args[0]);
        if(tosses<1){
            System.out.println("It shoudl be positive");
            System.exit(0);
        }

        int face;
        int nbHeads = 0; 
        int nbTails = 0; 
        for(int i=0; i<tosses; i++){
            if(Math.random()*2 < 1){
                face = 1;
            }else{
                face = 2;
            }
            if(face == 1){
                nbHeads++;
            }else{
                nbTails++;
            }
        }
        System.out.printf("%d number of tossing is done. %d of them is head and %d of them are tail.", tosses, nbHeads, nbTails);
    };
}
