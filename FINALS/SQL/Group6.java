
package group6;
import java.sql.*;
public class Group6 {
    static final String Tea_URL = "jdbc:mysql://localhost:3306";
    static final String user = "root";
    static final String pass = "";
    
    public static void main(String[] args) {
       
        try (Connection con = DriverManager.getConnection(Tea_URL, user, pass);
                Statement talker = con.createStatement();){
            String sql = "create database teatalker";
            talker.executeUpdate(sql);
            System.out.println("Welcome to Meowlktea Shop!");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
                }
    } 
}
