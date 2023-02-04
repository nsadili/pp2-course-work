public class calc {
    public static void main(String[] args){
        if(args.length < 2){
            System.out.print("Please enter arguments");
            System.exit(1);
        }
        var a = Integer.parseInt(args[0]);
        var b = Integer.valueOf(args[1]);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
