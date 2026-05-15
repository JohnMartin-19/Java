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

class Vehicle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut Tuut!!");
    }
}

class Car extends  Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}