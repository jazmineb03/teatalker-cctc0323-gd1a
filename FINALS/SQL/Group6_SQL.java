
package group6;
import java.sql.*;
public class Group6_SQL {
    
    private Connection con;
    private static Group6_SQL dbc;
    
    public Group6_SQL (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Meowlktea Shop");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teatalker", "root", "");
            System.out.println("Tea'Talker");
        }
        catch (Exception a) {
            System.out.println(a);  
        }
    }
    
    public static Group6_SQL getDatabaseConnection(){
        if (dbc==null) {
            dbc = new Group6_SQL();
        }
        return dbc;  
    }
    
    public static void main(String[] args) {
       new Group6_SQL();
    } 
}
