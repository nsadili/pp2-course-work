import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var n = scan.nextInt();
        var head = 0;
        var tail = 0;
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) {
                head++;
            } else {
                tail++;
            }
        }
        var prob_head=head*100/n;
        var prob_tail=tail*100/n;
        System.out.printf("number of heads: %d\nnumber of tails: %d\nprobability of heads: %d\nprobability of tails: %d",head,tail,prob_head,prob_tail);

    }
}
