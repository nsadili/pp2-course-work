/**
 * To compile: javac -d ./classes .\DieRolling.java <br />
 * To execute: java -cp .\classes\ DieRolling {value for # coin tossing} <br />

 * @author Nuraddin Sh. Sadili
 */

public class DieRolling {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("#die roll is not entered.");
            System.exit(0);
        }

        int nbDieRoll = Integer.parseInt(args[0]);

        if (nbDieRoll < 1) {
            System.out.println("#die roll must be positive");
            System.exit(0);
        }

        // int face;
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0;
        double rand;
        for (int i = 0; i < nbDieRoll; i++) {

            rand = Math.random();
            if (rand < 0.125) {
                // face = 1;
                f1++;
            } else if (rand < 0.25) {
                // face = 2;
                f2++;
            } else if (rand < 0.375) {
                // face = 3;
                f3++;
            } else if (rand < 0.5) {
                // face = 4;
                f4++;
            } else if (rand < 0.75) {
                // face = 5;
                f5++;
            } else {
                // face = 6;
                f6++;
            }

            // System.out.println(face);

        }

        System.out.printf("Out of %d rollings \n\t" + //
                "%-10d times came face 1 up, \n\t" + //
                "%-10d times came face 2 up, \n\t" + //
                "%-10d times came face 3 up, \n\t" + //
                "%-10d times came face 4 up, \n\t" + //
                "%-10d times came face 5 up, \n\t" + //
                "%-10d times came face 6 up\n", //
                nbDieRoll, f1, f2, f3, f4, f5, f6);

    }
}
