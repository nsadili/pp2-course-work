import java.util.Scanner;

import javax.xml.transform.Source;

public class GreatSmallElement {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("Print enter any value!");
            System.exit(1);
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Please add n: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("Please add an array: ");
        for (int i=0;i<n;i++){
            number[i] = sc.nextInt();
        }
        var mn=Integer.MAX_VALUE;
        var mx=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(number[i]>mx) mx=number[i];
            if(number[i]<mn) mn=number[i];
        }
        System.out.println("These Lines are created by using SCANNER");
        System.out.printf("The MAX value is: %d\n", getMax(number)); //scanner
        System.out.printf("The MIN value is: %d\n", getMin(number)); //scanner
        getMinMax(number); //scanner

        int [] numbers = new int[args.length];

        for (int i=0;i<args.length;i++){
            numbers[i] = Integer.valueOf(args[i]);
        }
        System.out.println("These Lines are created by using COMMAND LINE");
        System.out.printf("The MAX value is: %d\n", getMax(numbers)); //command line
        System.out.printf("The MIN value is: %d\n", getMin(numbers));//command line
        getMinMax(numbers);//command line
        
    }

    private static int getMax(int[] arr){
        var mx=Integer.MIN_VALUE;
        for (int elem: arr){
            if (elem>mx) mx=elem;
        }
        return mx;
    }

    private static int getMin(int[] arr){
        var mn=Integer.MAX_VALUE;
        for (int elem: arr){
            if (elem<mn) mn=elem;
        }
        return mn;
    }

    private static void getMinMax(int[] arr){
        var mn=Integer.MAX_VALUE;
        var mx=Integer.MIN_VALUE;
        for (int elem: arr){
            if(elem<mn) mn=elem;
            if(elem>mx) mx=elem;
        }
        System.out.printf("MAX: %d and MIN: %d\n\n", mx,mn);
    }
}