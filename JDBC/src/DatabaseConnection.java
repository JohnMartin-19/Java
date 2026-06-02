
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL      = "JDBC:postgresql://localhost:5432/school_db";
    private static final String USERNAME = "mburu";
    private static final String PASSWORD = "mburu";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}