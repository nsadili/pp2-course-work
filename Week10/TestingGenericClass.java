package Week10;

public class TestingGenericClass {
     
        public static void main(String[] args) {
        TestingGenericClass.<Double>print(3.0, 2.0, 5.0, 3.0, 65.0);
        print("Aliya", "Mahammad", "Sadi");
        print(2, "Yes", true);
        }
        private static <T> void print(T... args) {
        if (args.length == 0) { System.out.println("[]"); return; }
        System.out.print("[");
        for (int i = 0; i < args.length - 1; i++)
        System.out.print(args[i] + ", ");
        System.out.println(args[args.length - 1] + "]");
        }
      }

