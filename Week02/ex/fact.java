public class fact {
    public static void main(String[] args){
        if(args.length > 0){
        int a = Integer.parseInt(args[0]);
        var fact=1l;
        if(a>0){
            for(;a>0;a--){
                fact*=a;
            }
            System.out.println(fact);
        }else{
            System.out.println("Error");
        }
    }else{
        System.out.println("Please enter argument");
    }
}}
