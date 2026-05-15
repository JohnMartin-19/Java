package Packages;

import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        Scanner myObject = new  Scanner(System.in);
        System.out.println("Enter username");

        String username = myObject.nextLine();
        System.out.println(username);

    }
}