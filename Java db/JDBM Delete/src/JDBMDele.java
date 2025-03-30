import java.sql.*;
import java.util.Scanner;

public class JDBMDele {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // Try-with-resources for Scanner
            System.out.print("Enter name to delete: ");
            String name = sc.nextLine();

            String url = "jdbc:mysql://localhost:3306/jdbm";
            String user = "root";
            String password = "";

            // Establishing database connection
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = connection.prepareStatement("DELETE FROM user WHERE name = ?")) {

                pstmt.setString(1, name);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Record deleted successfully!");
                } else {
                    System.out.println("No record found with the given name.");
                }
            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());
            }
        }
    }
}
