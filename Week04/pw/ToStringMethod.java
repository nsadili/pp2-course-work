public class ToStringMethod {
    public static void main(String[] args){
        someRandomClass x = new someRandomClass(3, 0, 5);
        System.out.println(x.toString());
    }

    
}

class someRandomClass{
    int property1;
    int property2 ;
    int property3;

    someRandomClass(int p1, int p2, int p3){
        property1 = p1;
        property2 = p2;
        property3 = p3;

    }

    public String toString(){
        String result = "{" + Integer.toString(this.property1) +","+Integer.toString(this.property2)+","+Integer.toString(this.property3)+"}";
        return result;
    }
}