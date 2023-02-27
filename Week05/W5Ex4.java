class A {
    public static void main(String[] args) {
    Exercise_4 exercise_4 = new Exercise_4();
    System.out.println("AS"); 
    System.out.println("A"); }
    public A() { System.out.println("AC"); }
    public A(int x) { System.out.println(x + " AC"); }
    }

    
    class Exercise_4 extends A {
    static { System.out.println("GTS"); }
    { System.out.println("GT"); }
    public Exercise_4() {
    super(5);
    System.out.println("GTC");
    }
}

/* To solve the 4th exercise, we needed to modify the syntax to make
 the code work. The issue was that the code only had "static" written,
  which would result in an error. We needed to change it to the form 
  "public static void main(String[] args)". After making this change, 
  the code would output "GTS AS A".

Class A is a general or "super" class. In this class, we print AC and x + AC using
 println. Then, we added an extension called Exercise_4. Now, you may wonder why
  we don't have x + AC or AC. It's because we didn't have any content from 
  line 3. The computer ignores Exercise_4. Therefore, for the computer, Exercise_4 doesn't exist, and line 3 changes the input. The new input is "GTS 5 AC GT GTC AS A".

"GTS" is the first input element in all inputs because of "static". Then,
 we print 5 AC and ignore AC because we have x. If there's no x, then AC will
  be printed. After that, we print "GT GTC" and "AS A", which are declared by
   Exercise_4 and A, respectively.*/
