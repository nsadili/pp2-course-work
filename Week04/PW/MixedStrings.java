import java.util.Scanner;

public class MixedStrings {

   String sent = new String();
   String newstr = new String();

   void input(){

    Scanner sn = new Scanner(System.in);
    System.out.println("Enter a sentence");
    sent = sn.nextLine();
   }
String change(String w){
    int l = w.length();
    if(l==1)
    return w;
    else
    return w.charAt(l-1) + w.substring(1,l-1) + w.charAt(0);
}

void display(){
    String w = new String();
    Scanner st = new Scanner(sent);
    while(st.hasNext()){
        w = st.next();
        newstr=newstr+change(w)+" ";
    }
    System.out.println(newstr);
}

public static void main(String[]args) {
    MixedStrings obj= new MixedStrings();
    obj.input();
    obj.display();
}
}