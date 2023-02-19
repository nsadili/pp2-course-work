public class Wolfs {
    int legs;
    int eyes;
    String hairColor;

    Wolfs(){
        legs = 4; eyes = 2; hairColor = "grey";
    }

    Wolfs(String color){
        legs = 4; eyes = 2;  hairColor = color;
    } 

    Wolfs(int eyeCnt, String color){
        legs = 4; eyes = eyeCnt; hairColor = color;  
    }
    
    Wolfs(Wolfs wolf) {
        legs = wolf.legs;
        eyes = wolf.eyes;
        hairColor = wolf.hairColor;
    }

    public static void main(String[] args) {

    Wolfs alex = new Wolfs();
    Wolfs jax = new Wolfs("white");
    Wolfs susan = new Wolfs(2, "black");
    Wolfs copyOfJax = new Wolfs(jax); 

    System.out.println(alex.legs + " " + alex.eyes + " " + alex.hairColor);
    System.out.println(jax.legs + " " + jax.eyes + " " + jax.hairColor);
    System.out.println(susan.legs + " " + susan.eyes + " " + susan.hairColor);
    System.out.println(copyOfJax.hairColor);
}
}
