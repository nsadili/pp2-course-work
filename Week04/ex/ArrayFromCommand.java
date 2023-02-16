public class ArrayFromCommand {
    public static void main(String[] args) {

        if(args.length==0){

            System.out.println("Please enter the numbers");
            System.exit(1);

        }

        System.out.println("Arguments Passed in:");
        printArr(args);

        System.out.println("sum is: "+ sum(args)+ " average is: " + ((double) sum(args)/args.length));

       

    }

    private static void printArr(String[] args){

        for(String x:args){
            if(x!=args[args.length-1])
            System.out.print(x+",");
            else{
                System.out.println(x);
            }
        }

    }

    public static int sum(String[] arg){
        var sum=0;

        for(String s: arg){
            var elm=Integer.parseInt(s);
            sum+=elm;
        }

        return sum;
    }
}
