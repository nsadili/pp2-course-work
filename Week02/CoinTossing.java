public class CoinTossing {
  public static void main(String[] args) {

    if (args.length < 1) {
      System.out.println("Enter a value");
      System.exit(1);
    }

    var res = Math.random();
    if (res < 0.5)
      System.out.println("Head");
    else
      System.out.println("Tails");

  }
}