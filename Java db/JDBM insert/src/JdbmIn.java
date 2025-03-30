import java.sql.*;
import java.util.Scanner;

public class JdbmIn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // Try-with-resources for Scanner
            System.out.print("Enter the name of your student: ");
            String name = sc.nextLine();
            System.out.print("Enter the age of your student: ");
            int age = sc.nextInt();

            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/jdbm";

            // Establishing database connection
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = connection.prepareStatement("INSERT INTO user (name, age) VALUES (?, ?)")) {

                pstmt.setString(1, name);
                pstmt.setInt(2, age);

                int rowsAffected = pstmt.executeUpdate();
                System.out.println(rowsAffected + " row(s) inserted successfully!");
            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());
            }
        }
    }
}
