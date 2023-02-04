public class Harmonic {
public static void main(String[] args)
{
    if (args.length <1) 
    { 
System.out.println("Please enter the value: ");
System.exit(1);
    }
    var n = Integer.parseInt(args[0]);
    var sum = 0.0;
    for (var i = 1; i<=n; i++){
        sum=sum+(1/i);
    }
    System.out.printf("%f\n",sum);

}

}