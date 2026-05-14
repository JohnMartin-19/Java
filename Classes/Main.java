package Classes;

//multiple objects
//multiple attributes
public class Main{
    int j;
    int x = 5;
    String fname = "Mburuu";
    String lname = "Martin";

    //methods
    static void hello() {
        System.out.println("Hello John!!!");
    }
    static int num(int x, int y){
        return x*y;
    }

    ///access methods with an object
    
    public void fullThrottle(){
        System.out.println("The car is going fast");
    }

    public void speed(int maxSpeed){
        System.out.println("The max speed is: " + maxSpeed);
    }

    //constructors for the (Main) class
    public Main(){
         j = 4040;
    }
    public static void main(String[] args){
        Main myObj = new Main();
        Main myObj2 = new Main();

        myObj2.x = 25;
        hello();
        System.out.println(num(4,5));
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);

        //calling the methods
        Main car = new Main();
        car.fullThrottle();
        car.speed(180);

        Main constructorObj = new Main();
        System.out.println(constructorObj.j);




    }
}