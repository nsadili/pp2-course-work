public class Fact {

    public static void main(String[] args);

    if (n < 0){
        System.out.println("Please,enter a non-negative number.");
        System.exit(status:1);
    }

     
     var f=1;
     var c=1;

     while (c <=n) {
        f *=c;
        c++;
     }
     System.out.printf(format:"%d!= %d\n",n,f)
     
}


