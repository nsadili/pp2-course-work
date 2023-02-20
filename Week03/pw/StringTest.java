class StringTest {
    public static void main(String args[]) {
    String text = "Programming";
    System.out.println("String length: "+text.length());
    System.out.println("Equals 1: "+text.equals("programming"));
    System.out.println("Equals 2: "+text.equals("Programming"));
    System.out.println("The 5th character: "+text.charAt(5));
    System.out.println("Compare to : "+text.compareTo("principle"));
    System.out.println("Indef of 'gram' : "+text.indexOf("gram"));
    System.out.println("Substring : "+text.substring(3,6));
    }
    }