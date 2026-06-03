
//in this we use method overloading - basically having same method name but different params
public class Calculator {
    //handles for integer
    public int add(int a, int b){
        return a+b;
    }
    //for double
    public double add(double a,double b){
        return a+b;
    }

    //for int
    public int subtraction( int a, int b){
        return a-b;
    }

    public double subtraction( double a, double b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double multiply(double a, double b){
        return a*b;
    }


    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }


    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public int modulus(int a, int b){
        if (b == 0) throw new ArithmeticException("Cannot use zero as modulus");
        return a % b;
    }
    public double modulus (double a, double b){
        if (b == 0) throw new ArithmeticException("Cannot use zero as modulus");
        return a % b;
    }
}
