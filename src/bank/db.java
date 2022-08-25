/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Elif Deniz
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    private final String username="root";
    private final String password="1E5N1D1denizz*";
    private final String dbUrl="jdbc:mysql://localhost:3306/banking";
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,username,password);
    }
    public void errorMessage(SQLException exception){
        System.out.println("Error : "+exception.getMessage());
        System.out.println("Error code : "+exception.getErrorCode());
    }
}
