package Scanner;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in);

        System.out.println("Enter your details:");

        //string input
        String name = myObject.nextLine();
        int age = myObject.nextInt();
        double salary = myObject.nextDouble();


        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);
    }
}