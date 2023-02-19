import java.util.Scanner;

public class Wolf{
        int eyes;
        int nose;
        int ears;
        int teeth;
        int paws;
        int tail;

        public Wolf(int hisEyes, int hisNose, int hisEars, int hisTeeth, int hisPaws, int hisTail){
            eyes = hisEyes;
            nose = hisNose;
            ears = hisEars;
            teeth = hisTeeth;
            paws = hisPaws;
            tail = hisTail;
        }

        @Override
    public String toString() {
        return "Your Wolf has " +
                eyes + " eyes, " + nose + " nose, " + ears + " ears, " +
                teeth + " teeth, " + paws + " paws, " + tail + " tails. ";
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Write how many eyes your Wolf has: ");
            int a = sc.nextInt();
            System.out.println("Write how many noses your Wolf has: ");
            int b = sc.nextInt();
            System.out.println("Write how many ears your Wolf has: ");
            int c = sc.nextInt();
            System.out.println("Write how many teeth your Wolf has: ");
            int d = sc.nextInt();
            System.out.println("Write how many paws your Wolf has: ");
            int e = sc.nextInt();
            System.out.println("Write how many tails your Wolf has: ");
            int f = sc.nextInt();

            System.out.println("Write how many eyes your Wolf has: ");
            int g = sc.nextInt();
            System.out.println("Write how many noses your Wolf has: ");
            int h = sc.nextInt();
            System.out.println("Write how many ears your Wolf has: ");
            int i = sc.nextInt();
            System.out.println("Write how many teeth your Wolf has: ");
            int j = sc.nextInt();
            System.out.println("Write how many paws your Wolf has: ");
            int k = sc.nextInt();
            System.out.println("Write how many tails your Wolf has: ");
            int l = sc.nextInt();

            sc.close();

            Wolf rocky = new Wolf(a, b, c, d, e, f);
            Wolf alex = new Wolf(g, h, i, j, k, l);

            alex = rocky;

            System.out.println(rocky);    
            System.out.println(alex);        
        }    
}