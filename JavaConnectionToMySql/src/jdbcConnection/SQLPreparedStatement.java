/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anticn
 */
public class SQLPreparedStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "Tech09360851403";
        
        try {
            Connection myConnection = DriverManager.getConnection(url,username,password);
            
            //Pravimo statement za unos podataka u tabelu
            String sqlQuery = "INSERT INTO student VALUES(?,?,?)";
            PreparedStatement preparedStatement = myConnection.prepareStatement(sqlQuery);
            // Naseljavamo statement sa podacima koje zelimo da unesemo u tabelu
            preparedStatement.setInt(1, 7);
            preparedStatement.setString(2, "Ana");
            preparedStatement.setString(3, "Antic");
            
            // Izvrsavamo spremljeni statement
            int rows = preparedStatement.executeUpdate();
            if (rows > 0) {
                System.out.println("A row is succesfully added");
            }
            preparedStatement.close();
            myConnection.close();
        } catch (SQLException e) {
            System.out.println("Connection Faild " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
