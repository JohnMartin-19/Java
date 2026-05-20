//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import grading.GradingCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE TURNKEY GRADING SYSTEM.");
        System.out.println("Enter the grades.");
        GradingCalculator calc = new GradingCalculator();
        Scanner scan = new Scanner(System.in);

        int marks = scan.nextInt();

        var grade = calc.getGrade(marks);


        System.out.println(grade);


    }
}