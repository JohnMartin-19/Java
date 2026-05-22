
public class Course {

    private String courseCode;
    private String courseName;
    private int credits;
    private Teacher teacher;

    //constructor

    public Course(String courseCode, String courseName, int credits, Teacher teacher){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.teacher = teacher;
    }

    public void assignTeacher(Teacher teacher){
        this.teacher =  teacher;
        System.out.println(teacher.getName() + "is assigned to " + courseName);
    }

    public void displayCourseInfo(){
        System.out.println("Course: " + courseName + " (" + courseCode + ") | Credits: " + credits + " |" +
                " Teacher: " + teacher.getName());
    }

    //getters and setters
    public String getCourseCode(){
        return courseCode;
    }
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public int getCredits(){
        return  credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }


}