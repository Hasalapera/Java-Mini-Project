//package dao;
//
//import Database.DatabaseConnection;
//import Models.User;
//
//import java.sql.*;
//
//public class UserDAO implements CRUDOperations<User> {
//    private Connection conn = DatabaseConnection.connect();
//
//    @Override
//    public void add(User user) {
//        try {
//            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setString(1, user.name);
//            stmt.setString(2, user.email);
//            stmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void update(User user) {
//        // Similar to add() method
//    }
//
//    @Override
//    public void delete(int id) {
//        // Code to delete user
//    }
//
//    @Override
//    public User get(int id) {
//        // Code to get user by ID
//        return null;
//    }
//}
//
