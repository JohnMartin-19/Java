
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
         Calculator calc = new Calculator();
         Scanner scan = new Scanner(System.in);

         System.out.println("-----Calculator----");
         System.out.println("Enter first number");
         double a = scan.nextDouble();

         System.out.println("ENTER SECOND NUMBER");
         double b = scan.nextDouble();

        System.out.println("Choose operation: 1-Add  2-Subtract  3-Multiply  4-Divide  5-Modulus");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                System.out.println("Result: " + calc.add(a, b));
                break;
            case 2:
                System.out.println("Result:" + calc.subtraction(a,b));
                break;
            case 3:
                System.out.println("Result:" + calc.multiply(a,b));
                break;
            case 4:
                System.out.println( "Result:" + calc.divide(a,b));
                break;
            case 5:
                System.out.println("Result:" + calc.modulus(a,b));
                break;
            default:
                System.out.println("Input Error");
        }
        scan.close();
    }
}