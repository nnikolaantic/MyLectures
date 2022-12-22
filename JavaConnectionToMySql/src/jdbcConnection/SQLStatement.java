/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anticn
 */
public class SQLStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "Tech09360851403";
        
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test","root","Tech09360851403");
            
            String query = "SELECT * FROM student";
            //Ovde pravimo objekat klase Statement jer ne zeleimo da dinamicki menjamo 
            //query i koristimo metodu createStatement() koja ne prima nikakav query
            Statement st = myConnection.createStatement();
            
            //Ovde executujemo query i rezultate stavljamo u objekat klase ResultSet
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                int id = rs.getInt(1);
//                String firstName = rs.getString(2);
                String firstName = rs.getString("first_name");
                String lastName = rs.getString(3);
                
                System.out.println("| id - " + id + " | first_name - " + firstName + " | last_name - " + lastName + " |" );

            }
            myConnection.close();

//            ArrayList<Student> studentList = pupulateStudentList();
//            for (Student student : studentList) {
//                System.out.println("| id - " + student.getId() + " | first_name - " + student.getFirstName() + " | last_name - " + student.getLastName() + " |" );
//            }
        } catch (SQLException e) {
            System.out.println("Display Faild " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
