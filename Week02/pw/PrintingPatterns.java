public class PrintingPatterns {
    /**
     * @param args
     */
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Please, enter the number");
            System.exit(1);
        }

        int num=Integer.valueOf(args[0] );

        var i=1;

        for(i=1;i<=4;i++){
         if(i%2!=0){
            for(int j=1;j<=num;j++){
                if(j%2!=0){
                    System.out.print("* ");
                } else{
                    System.out.print("# ");
                }
            }
            System.out.println("");
         } else{
            for(int j=1;j<=num;j++){
                if(j%2==0){
                    System.out.print("* ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.println("");
         }
     
    }
}
}

