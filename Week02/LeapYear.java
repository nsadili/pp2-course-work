public class LeapYear {
    public static void main(String[] args){
        var year=Integer.parseInt(args[0]);
        if (year%4==0) {System.out.println(year+" is a leap year");}
        else{System.out.println(year+" is not a leap year");}
    }
}
