import java.util.Scanner;
public class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Point[] qutu = {new Point(4,4),new Point(6,2),new Point(3,-8),new Point(-4,3)};
        directionPoints(qutu);
    }
    public void show(String direction){

        System.out.println("("+this.x+","+this.y+") is most "+direction);
    }
    public static void directionPoints(Point[] qutu){
        int[] pointx = new int[qutu.length];
        int[] pointy = new int[qutu.length];
        for(int k=0; k<qutu.length; k++){
            pointx[k] = qutu[k].x;
            pointy[k] = qutu[k].y;
        }
        //-----------------------------------------------------------------
        int maxY = pointy[0];
        int index = 0;
        for(int k=0; k< qutu.length; k++){
            if(maxY<pointy[k]){
                maxY = pointy[k];
                index = k;
            }
        }
        qutu[index].show("North");
        //-----------------------------------------------------------------
        int maxX = pointx[0];
        index = 0;
        for(int k=0; k< qutu.length; k++){
            if(maxX<pointx[k]){
                maxX = pointx[k];
                index = k;
            }
        }
        qutu[index].show("East");
        //----------------------------------------------------------------
        int minX = pointx[0];
        index = 0;
        for(int k=0; k< qutu.length; k++){
            if(minX>pointx[k]){
                minX = pointx[k];
                index = k;
            }
        }
        qutu[index].show("West");
        //----------------------------------------------------------------
        int minY = pointy[0];
        index = 0;
        for(int k=0; k< qutu.length; k++){
            if(minY>pointy[k]){
                minY = pointx[k];
                index = k;
            }
        }
        qutu[index].show("South");

}
}






