import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository{
    //insert
    public int insert(Student student) throws SQLException {
        String sql = "INSERT INTO students (name, email, age, course, gpa) VALUES (?,?,?,?,?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, student.getName());
            stmt.setString(2, student.getEmail());
            stmt.setInt(3, student.getAge());
            stmt.setString(4, student.getCourse());
            stmt.setDouble(5, student.getGpa());
            stmt.executeUpdate();

            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next()) return keys.getInt(1);

        }
        return -1;
    }

    //select by ID
    public Optional<Student> findById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return Optional.of(mapRow(rs));  // wrap in Optional
            }
            return Optional.empty();

        } catch (SQLException e) {
            System.err.println("Read failed: " + e.getMessage());
        }
        return Optional.empty();
    }

    private Student mapRow(ResultSet rs) throws SQLException {
        return new Student(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getInt("age"),
                rs.getString("course"),
                rs.getDouble("gpa")
        );
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
    
    //find by course
    public List<Student> findByCourse(String course) throws SQLException {
        String sql = "SELECT * FROM students WHERE course = ? ORDER BY gpa DESC";
        List<Student> students = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, course);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) students.add(mapRow(rs));
        }
        return students;
    }

    //update
    public boolean update(int id, String newEmail, double newGpa) {
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
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("Update failed: " + e.getMessage());
        }
        return false;
    }

    //delete
    public boolean delete(int id) {
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
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Delete failed: " + e.getMessage());
        }
        return false;
    }

}