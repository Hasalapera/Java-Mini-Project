package Main;

import Database.DatabaseConnection;
import Student.Login;

public class StudentManagement {

    public static void main(String[] args) {
        System.out.println("Welcome to Student Management System!");
        DatabaseConnection.connect(); // Connect to MySQL
        String userName = "";
        String password = "";
        new Login(); // Open login UI
    }
}

