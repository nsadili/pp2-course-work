package Pw;

import java.util.Scanner;

public class CustomeR {
    public static void main(String[] args) {

    }

    public void Customer() {
        int ID;
        String name;
        char gender;

    }

    public void getID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your Customer ID");
        int ID = sc.nextInt();

    }

    public void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your Name");
        String Name = sc.next();
    }

    public void getGender() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your Gender");
        String Gender = sc.next();
    }

}
