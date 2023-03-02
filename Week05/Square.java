import java.util.Scanner;

class Square extends Rectangle {
    
        public Square(int sideSize) {
            super(sideSize, sideSize);
            super.name = "Square";
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size: ");

            System.out.println();

            int x = sc.nextInt();

            Square kvadrat = new Square(x);

            System.out.println(kvadrat.calcPerimeter());
            System.out.println(kvadrat.calcArea());
            kvadrat.printName();

            sc.close();
        }

}
