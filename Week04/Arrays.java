public class Arrays {
    public static void main(String[] args) {

        // Get Array
        // int[] num = new int[args.length];
        // for (int i = 0; i < args.length; i++) {
        // num[i] = Integer.parseInt(args[i]);
        // }
        // OR

        // int[] num2 = new int[args.length];
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < args.length; i++){
        // num2[i] = sc.nextInt();
        // }

        int[] num = { 5, 3, 3, 2, 2, 1, 4, 5, 1, 2, 10, 9, 9, 2, 2, 3, 4, 8, 7, 6 };
        String str = "Exercise Test";

        String str1 = "listen";
        String str2 = "silent";

        String str3 = "banana";
        String str4 = "nan";

        Point[] points = {new Point(1, 2),new Point(9, 3),new Point(-3, 7),new Point(4, 3)};

        Print.printArrays(num); //Arrays 1 
        MinMax.findMinAndMax(num); //Arrays 2
        Histogram.findHistogram(num);//Arrays 3

        System.out.println(Reverse.reverse1(str));// Strings 7
        System.out.println(Reverse.reverse2(str));//
        System.out.println(Reverse.reverse3(str));//
        System.out.println(Reverse.reverse4(str));//

        Explode.findExploded(str1);//Strings 8
        System.out.println();

        System.out.println(Anagram.isAnagram(str1, str2));//Strings 10
        System.out.println(Anagram.isAnagram(str1, str));//

        System.out.println(MixedString.swapFirstAndLast(str));//Strings 11

        System.out.println(Substring.substringIndex(str3, str4));//String 12

        Slices.toSlices(str1);//Strings 13

        ArrayOfPoints.extremePoints(points);//Arrays of Objects 16




    }

}
