import java.util.Arrays;

public class Test {
    public static void main(String args[]) {
        String str= Arrays.toString(args);
        System.out.println(str.equals(Arrays.toString(args)));
        String str2="My room is big";
        System.out.println(str.charAt(1));
        System.out.println(str.substring(0, 10));
        System.out.println(str.concat(str2));
        System.out.println(str2.repeat(2));

        System.out.println(str2.replace(str2.charAt(0),'d' ));
        System.out.println(str2.replace(str2,"dig"));
        System.out.println(str2.strip());


    }
}
