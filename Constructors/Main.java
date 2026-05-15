package Constructors;

//for Access Identifiers
class Person{
    public String name = "Mburu";
    private int age = 24;
    private String location;

    public static void main(String[] args) {
        Person mtu = new Person();
        System.out.println(mtu.age); 
    }

    //getter
    public String getLocation(){
        return location;
    }

    //setter
    public void setLocation(String newLocation){
        this.location = newLocation;
    }
    
}

public class Main{

    // int x; //class var

    // public Main(int x){
    //     this.x = x; //refers to the class var
    // }

    // public static void main(String[] args) {
    //     Main myObj = new Main(5);
    //     System.out.println(myObj.x);
    // }
    //constructors with the "THIS" keyword
    int modelYear;
    String modelName;

    public Main(String modelName){
        this(2020,modelName); 
    }

    public Main(int modelYear, String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo(){
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        Main car1 = new Main("Corvette");
        Main car2 = new Main(2024, "Mazda");
        car1.printInfo();
        car2.printInfo();

        Person p = new Person();
        System.out.println(p.name); // works fine
        //System.out.println(p.age); //raises an error since its private



    }
}
