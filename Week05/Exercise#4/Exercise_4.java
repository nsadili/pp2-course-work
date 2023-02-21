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

//For 4th exercise, we used to change syntaxis, so the code will work. The main problem was that there were only "static" written in the code
//which will give error. It should be changed to this form "public static void main(String[] args". 
//After this act, the code will give an output "GTS AS A". Why is it so?
//Class A is a general one. To be more precise a "super" one. We say to println AC and then x + AC in this class. Then we added extension, which is Exercise_4
//Now you will be asked by question - "why do not we have x + AC or AC". That's because we didn't have a content from line 3. Exercise_4 is ignored by computer
//So, for computer Exercise_4 does not exist. That's why line 3 changes input
//So, new input is "GTS 5 AC GT GTC AS A". GTS is the first input element in all inputs, because of "static." Then we print 5 AC and ignore AC, because we have x
//If there's no x, so AC will be printed
//Then "GT GTC" and "AS A" are printed, which are declared by Exercise_4 and A, respectively! 