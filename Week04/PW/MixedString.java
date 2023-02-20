

public class MixedString {
    public static void main(String[] args) throws Exception {
        String a= "This is PP2 Fall 2021";
        System.out.println(Mix(a));



    }
    public static String Mix(String a){
        String[] rev = a.split(" ");
        StringBuilder ch = new StringBuilder();
        for (String d : rev) {
            if (d.length() > 1) {
            char first = d.charAt(0);
            char last = d.charAt(d.length() - 1);
            String middle = d.substring(1, d.length() - 1);
            ch.append(last).append(middle).append(first).append(" ");
        } 
        else {
            ch.append(d).append(" ");
        }
    }
    return ch.toString().trim();

    }
}