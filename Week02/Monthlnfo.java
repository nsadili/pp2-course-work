public class Monthlnfo {
    public static void main(String[]args){
    
    if(args.length<1){
        System.out.println("Please, provide a number!");
        System.exit(1);
    }

        int monthNo = Integer.parseInt(args[0]);
    
        switch(monthNo){
            case 1:
             System.out.println("Jan-31");
             break;
            case 2:
             System.out.println("Feb-28");
             break;
            case 3:
             System.out.println("Mar-31");
             break;
            case 4:
             System.out.println("Apr-30");
             break;
            default:
             System.out.println("Enter a valid month number");
            
        }
    }
}
