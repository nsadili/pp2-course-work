public class Histogram {
    
    static void histogram(int[] args){
        int cnt[]={0,0,0,0,0,0,0,0,0,0,0};
    for(int i=0; i<11; i++){
        for(int j=0;j<args.length; j++)
        if (args[j]== i) cnt[i]++;
    }
    
    for(int n=0;n<11;n++){
       System.out.printf("%d |", n);
        for(int m=1;m<=cnt[n];m++){
        System.out.print("*");
        }
        System.out.println("> " +cnt[n]);
    }
   
    }

public static void main(String[] args) {
    if(args.length==0){
        System.out.println("Please, enter the grades");
        System.exit(1);
    } 
    int[] a = new int[args.length];
    for (int i = 0; i < a.length; i++){
        a[i] = Integer.valueOf(args[i]);
    }
    
    histogram(a);

}

}
