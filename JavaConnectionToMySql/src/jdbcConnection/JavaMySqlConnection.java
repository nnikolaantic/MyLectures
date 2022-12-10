/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anticn
 */
public class JavaMySqlConnection {
    public static void main(String[] args) {
        // Argumenti koji su nam potrebni za konekciju na bazu
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "Tech09360851403";
        
        // 2. Okruzujemo statement za konekciju na bazu sa try catch blokom jer metoda getConnection moze da baci exception
        try {
            // 1.Konektujemo se na bazu preko Connection classe 
            Connection myConnection = DriverManager.getConnection(url,username,password);
            
            System.out.println("Connected to database succesfully");
        } catch (SQLException e) {
            System.out.println("Connection Faild " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
