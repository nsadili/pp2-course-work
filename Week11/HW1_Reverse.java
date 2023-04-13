package Week11;


public class HW1_Reverse {
    public static void main(String[] args) {
        ReverseStr rv = (String s) -> new StringBuilder().reverse().toString();

        System.out.println(rv.reverse("first"));
    }
}

@FunctionalInterface

interface ReverseStr{
    String reverse(String str);
}