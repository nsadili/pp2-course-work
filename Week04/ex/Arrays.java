public class Arrays {
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        System.out.printf("Elements of an object a: {" + a[0]);
        System.out.printf("," + a[1]);
        System.out.println("," + a[2] + "}.");

       /* System.out.print("Elements of an object a: {");
        for (int i = 0; i < 3; i++) {
            System.out.print(+ a[i] + ",");
        }
        */

     //   System.out.print("}.");
       // System.out.println();

        System.out.printf("Elements of an object b: {" + b[0]);
        System.out.printf("," + b[1]);
        System.out.println("," + b[2] + "}.");

       /* System.out.print("Elements of an object b: {");
        for (int i = 0; i < 3; i++) {
            System.out.print(+ b[i] + ",");
        }
        System.out.print("}.");
        */

        a = b;

        System.out.println();

        System.out.printf("Elements of an object a: {" + a[0]);
        System.out.printf("," + a[1]);
        System.out.println("," + a[2] + "}.");


        System.out.printf("Elements of an object b: {" + b[0]);
        System.out.printf("," + b[1]);
        System.out.println("," + b[2] + "}.");


        System.out.println();

        a[0] = 7;

        System.out.printf("Elements of an object a: {" + a[0]);
        System.out.printf("," + a[1]);
        System.out.println("," + a[2] + "}.");

        System.out.printf("Elements of an object b: {" + b[0]);
        System.out.printf("," + b[1]);
        System.out.println("," + b[2] + "}.");






    }
}
