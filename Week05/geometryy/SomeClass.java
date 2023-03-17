package week05.geometryy;

public class SomeClass {
    
        static int a = 5;
        int b = 3;
        public static void main(String [] args){
        SomeClass sc1 = new SomeClass();
        SomeClass sc2 = new SomeClass();
        SomeClass sc3 = new SomeClass();
        sc2.b = 15; sc2.a = 5; sc3.b = -3; SomeClass.a = 100;
        sc1.a = 200; 
        sc3.a = 300;
        sc3.a++;
        sc2.a++;
        System.out.println(sc1.a);
        System.out.println(sc2.a);
        System.out.println(sc3.a);
        System.out.println();
        }
        
    
}