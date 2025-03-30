import java.sql.*;
import java.util.Scanner;
public class JdbmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter exsiting value: ");
        int x = sc.nextInt();
        System.out.print("Enter New value: ");
        int y = sc.nextInt();

        String url = "jdbc:mysql://localhost:3306/jdbm";
        String user = "root";
        String password = "";

        try(Connection connection=DriverManager.getConnection(url,user,password);
            PreparedStatement pstm=connection.prepareStatement("UPDATE user SET Age =? WHERE Age=? ");){
pstm.setInt(1,y);
pstm.setInt(2,x);
            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("No record found with the given ID.");
            }
        }catch (SQLException e){
            System.out.printf("Database error: %s\n",e.getMessage());
        }

    }
}
