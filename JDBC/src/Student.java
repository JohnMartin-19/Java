class Student{
    private  int id;
    private String name;
    private String email;
    private int age;
    private String course;
    private double gpa;

    //constr without id for DB POSTR requests/ INSERT
    public Student(String name, String email, int age, String course, double gpa){
        this.name = name;
        this.email = email;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

    //constr with ID for read ops

    public Student(int id, String name, String email, int age, String course, double gpa){
        this.id = id;
        this.name = name;
        this.email=email;
        this.course = course;
        this.gpa = gpa;
    }

    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getCourse(){
        return course;
    }
    public double getGpa(){
        return gpa;
    }

    @Override
    public String toString(){
        return "Student{id=" + id + ", name=" + name + ", email=" + email
                + ", age=" + age + ", course=" + course + ", gpa=" + gpa + "}";
    }

}