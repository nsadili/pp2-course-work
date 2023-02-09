class Wolf {
    // members declared here.
    int eyeCnt;
    String color;
    Wolf() { /* an empty constructor */
    } 

    Wolf(String color) { /* constructor that sets wolf’s color upon creation */ 
    } 

    Wolf(int eyeCnt, String color) { /* eyes and color are set */
    } 

    Wolf(Wolf anotherWolf) { /* making a copy of a wolf object */
    eyeCnt = anotherWolf.eyeCnt;
    color = anotherWolf.color; //this applies to all the fields
    }
    // remaining code
    }
    
public class Constructors {
    public static void main(String[] args) {
        
    }
}
