
public class Teacher extends Person{
    private String employeeId;
    private String subject;
    private double salary;

    //constructor
    public Teacher(String name, int age, String email, String employeeId, String subject, double salary){
        super(name,age, email);
        this.employeeId = employeeId;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayInfo(){
        System.out.println("Teacher: " + getName() + " | ID: " + employeeId + " | Subject: " + subject + " | Salary: "
                + salary);
    }

    public void teaches(){
        System.out.println(getName() + "is teaching" + subject);
    }

    //getters and setters

    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}