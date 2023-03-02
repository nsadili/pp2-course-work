package Enums;

enum PLanet{
    MERCURY,VENUS,EARTH,MARS,JUPITER,SATURN,URANUS,NEPTUNE,PLUTO;
}

public class Planet {
    public static void main(String[] args) {
        
        PLanet myPLanet = PLanet.MARS;
        CanILiveHere(myPLanet);
    }


    public static void CanILiveHere(PLanet myPLanet) {
        switch(myPLanet) {
            case EARTH:
            System.out.println("You can live here :)");
            break;
            default:
            System.out.println("You cannot live here ... yet :()");
            break;
        }
    }
}