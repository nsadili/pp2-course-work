public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String sub = s1.substring(i, j);
                if (s2.contains(sub)) {
                    System.out.println(sub);
                    count++;
                }
            }
        }
        System.out.println("The number of substrings is: " + count);
    }

}



