public class PrintingPatterns {
    public static void main(String[] args){
        var n=Integer.parseInt(args[0]);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==j%2) {System.out.print("*");}
                else {System.out.print("#");}
            }
            System.out.printf("\n");
        }
    }
}
