

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws SQLException {
        StudentRepository repo = new StudentRepository();

        // post
        System.out.println("=== INSERT ===");
        int id1 = repo.insert(new Student("John Mburu",    "john@uni.com",  21, "Engineering", 3.8));
        int id2 = repo.insert(new Student("Jane Achieng",  "jane@uni.com",  22, "Engineering", 3.5));
        int id3 = repo.insert(new Student("Mike Odhiambo", "mike@uni.com",  20, "Business",    3.2));
        int id4 = repo.insert(new Student("Alice Wanjiru", "alice@uni.com", 23, "Business",    3.7));
        System.out.println("Inserted students with IDs: " + id1 + ", " + id2 + ", " + id3 + ", " + id4);

        // get all students
        System.out.println("\n=== ALL STUDENTS ===");
        repo.findAll().forEach(System.out::println);

        // get student by {id}
        System.out.println("\n=== FIND BY ID ===");
        Optional<Student> found = repo.findById(id1);
        found.ifPresent(s -> System.out.println("Found: " + s));

        // update student
        System.out.println("\n=== UPDATE ===");
        boolean updated = repo.update(id1, "john.mburu@uni.com", 3.9);
        System.out.println("Updated: " + updated);
        repo.findById(id1).ifPresent(s -> System.out.println("After update: " + s));


        // DELETE
        System.out.println("\n=== DELETE ===");
        boolean deleted = repo.delete(id3);
        System.out.println("Deleted: " + deleted);

        System.out.println("\n=== AFTER DELETE ===");
        repo.findAll().forEach(System.out::println);
    }
}