/**
 * To compile: javac -d ./classes .\CoinTossing.java <br />
 * To execute: java -cp .\classes\ CoinTossing {value for # coin tossing} <br />
 * 
 * @author Nuraddin Sh. Sadili
 */

public class CoinTossing {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("#coin toss is not entered.");
            System.exit(0);
        }

        int nbCoinToss = Integer.parseInt(args[0]);

        if (nbCoinToss < 1) {
            System.out.println("#coin toss must be positive");
            System.exit(0);
        }

        int face, nbHeads = 0, nbTails = 0;
        for (int i = 0; i < nbCoinToss; i++) {

            face = (Math.random() * 2 < 1) ? 1 : 2;

            // System.out.println(face);

            if (face == 1)
                nbHeads++;
            else
                nbTails++;
        }

        System.out.printf("Out of %d tossings %d landed on head and %d landed on tail\n", //
                nbCoinToss, nbHeads, nbTails);

    }
}
