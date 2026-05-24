
public class Main{
    public static void main(String[] args){
        //create a dept
        Department infoTech = new Department("Information Technology");

        //create teachers
        Teacher t1 = new Teacher("Anne Wanjiru", 35, "alice@school.com", "T001", "Algorithms", 85000);
        Teacher t2 = new Teacher("Bob Kamau", 42, "bob@school.com", "T002", "Databases", 90000);

        //create students
        Student s1 = new Student("John Mburu", 24, "john@school.com", "S001", 3.8, "Algorithms");
        Student s2 = new Student("Jane Achieng", 22, "jane@school.com", "S002", 3.5, "Databases");
        Student s3 = new Student("Mike Odhiambo", 20, "mike@school.com", "S003", 3.2, "Algorithms");

        //add to dept
        infoTech.addStudent(s1);
        infoTech.addStudent(s2);
        infoTech.addStudent(s3);
        infoTech.addTeacher(t1);
        infoTech.addTeacher(t2);

        // display everything
        System.out.println("=== DEPARTMENT: " + infoTech.getDepartmentName() + " ===\n");

        System.out.println("--- TEACHERS ---");
        infoTech.displayAllTeachers();

        System.out.println("\n--- STUDENTS ---");
        infoTech.displayAllStudents();

        System.out.println("\n--- SUMMARY ---");
        System.out.println("Total Students: " + infoTech.getStudentCount());
        System.out.println("Total Teachers: " + infoTech.getTeacherCount());

        //polymorphism
        Person[] people = {t1,s1,s2};
        for (Person p: people){
            p.displayInfo();

        }
        //intro Inherited from Person
        System.out.println(s1.Intro());
        System.out.println(t1.Intro());

        //what each teacher teaches

        t1.teaches();
        t2.teaches();

    }
}