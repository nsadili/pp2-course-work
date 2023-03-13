public static void main(String[] args) {
    String string = "hello world";
    String sub = "world";
    int index = string.indexOf(sub);
    if (index != -1) {
        System.out.println(index); // Output: 6
    } else {
        System.out.println(-1);
    }
}