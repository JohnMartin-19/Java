public class Employee{
    private String id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private boolean active;

    //constructor
    public Employee(String id, String name, String department, double salary, int age, boolean active){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.active = active;
    }

    //getters
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    public int getAge(){
        return age;
    }

    public boolean isActive(){
        return active;
    }

    @Override
    public String toString(){
        return  "Employee{id=" + id + ", name=" + name +
                ", dept=" + department + ", salary=" + salary +
                ", age=" + age + ", active=" + active + "}";
    }

}