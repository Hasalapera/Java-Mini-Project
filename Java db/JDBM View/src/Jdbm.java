import java.sql.*;
public class Jdbm {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbm";
        String user = "root";
        String password = "";
        String query = "select Name,Age from user";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                String name=resultSet.getString(1);
                int age=resultSet.getInt(2);
                System.out.println(name+" "+age);
            }
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
