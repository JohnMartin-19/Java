

public class Student extends Person{
    private String studentId;
    private String course;
    private double gpa;

    //student constructor
    public Student (String name, int age, String email,String course, double gpa, String studentId){
        super(name,age,email);
        this.course = course;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void displayInfo(){
        System.out.println("Student: " + getName() + " | ID: " + studentId + " | GPA: " + gpa + " | Course: " + course);
    }


    //getters and setters
    public String getStudentId(){
        return studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }

    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
}