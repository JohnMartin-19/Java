import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository{
    //insert
    public void insert(String name, String email, int age, String course, double gpa) {
        String sql = "INSERT INTO students (name, email, age, course, gpa) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, age);
            stmt.setString(4, course);
            stmt.setDouble(5, gpa);

            int rowsAffected = stmt.executeUpdate();
            System.out.println("Inserted " + rowsAffected + " row(s)");

        } catch (SQLException e) {
            System.err.println("Insert failed: " + e.getMessage());
        }
    }

    //select by ID
    public Optional<Student> findById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {  // moves cursor to first row
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getDouble("gpa")
                );
            }

        } catch (SQLException e) {
            System.err.println("Read failed: " + e.getMessage());
        }
        return null;
    }

    //read all
    public List<Student> findAll() {
        String sql = "SELECT * FROM students ORDER BY name";
        List<Student> students = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {  // iterate all rows
                students.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getDouble("gpa")
                ));
            }

        } catch (SQLException e) {
            System.err.println("Read all failed: " + e.getMessage());
        }
        return students;
    }

    //update
    public void update(int id, String newEmail, double newGpa) {
        String sql = "UPDATE students SET email = ?, gpa = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newEmail);
            stmt.setDouble(2, newGpa);
            stmt.setInt(3, id);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student " + id + " updated");
            } else {
                System.out.println("No student found with ID " + id);
            }

        } catch (SQLException e) {
            System.err.println("Update failed: " + e.getMessage());
        }
    }

    //delete
    public void delete(int id) {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student " + id + " deleted");
            } else {
                System.out.println("No student found with ID " + id);
            }

        } catch (SQLException e) {
            System.err.println("Delete failed: " + e.getMessage());
        }
    }

}