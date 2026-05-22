
public abstract class Person{
    private String name;
    private int age;
    private String email;


    //constructor with params
    public Person( String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public abstract void displayInfo();

    //shared method(Intro)

    public String Intro(){
        return "Hello there, I am " + name + "I am " + age
                + " years old.";
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int  age){
        this.age = age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}