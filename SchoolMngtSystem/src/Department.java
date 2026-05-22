import java.util.List;
import java.util.ArrayList;

public class Department{
    private String departmentName;
    private List<Student> students;
    private List<Teacher> teachers;

    //constructor
    public Department(String departmentName){
        this.departmentName = departmentName;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();

//        students.add("Mburu");
//        students.add("Mary");
//        students.add("Peter");
//        students.add("Mike");
//        students.add("Wanitwa Mos");
//
//        teachers.add("Rose");
//        teachers.add("Mwaniki");
//        teachers.add("Kamau");
//        teachers.add("Linet");
//        teachers.add("Mwangi");
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void displayAllStudents(){
        for (Student student : students){
            student.displayInfo();
        }
    }

    public void displayAllTeachers(){
        for (Teacher teacher : teachers){
            teacher.displayInfo();
        }
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public int getStudentCount(){
        return students.size();
    }

    public int getTeacherCount(){
        return teachers.size();
    }
}