public class PolarityOfNumber {
    public static void main(String[] args){
        var n=Integer.parseInt(args[0]);
        if(n<0){System.out.println(n+" is negative");}
        if(n>0){System.out.println(n+" is positive");}
        if(n==0){System.out.println(n+" is neutral");}
    }
    
}
