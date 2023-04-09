package pw;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MyQueue {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the number of breads: ");
    int num= scan.nextInt();
    int customerNUm=0;
    Queue<Integer> breadLine = new PriorityQueue<>();
    System.out.println("Please enter the demand of each customer 'number of breads':  ");
    while(scan.hasNextInt()){
        int bread=scan.nextInt();
        breadLine.offer(bread);
        num-=bread;
        customerNUm++;
        if(num<=0) {customerNUm--; break;}
    }
    System.out.println("Number of people buyed bread:"+ customerNUm);
    System.out.println("Breads left in the store:"+num);
}
}