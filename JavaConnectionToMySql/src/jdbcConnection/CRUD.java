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
import java.util.ArrayList;
import models.Student;

/**
 *
 * @author anticn
 */
public class CRUD {
//    ArrayList<Student> studentList = new ArrayList<>(); ako zelite da radite neku obradu podataka mozete podatke iz tabele da uskladistite u neku,
//                                                          strukutru podataka kao sto je ArrayList
    
    public static void main(String[] args) {
        CRUD crud = new CRUD();
//        crud.insertStudent(3, "Mihailo", "MikiMiki");
        
        crud.displayTableStudent();
        System.out.println("-----------------------------------------------");
        crud.updateStudent(3, "Mita", "Bekrija");
        crud.updateStudent(6, "Mita", "Bekrija"); //Namerno da ga slomim
        crud.displayTableStudent();
        
        System.out.println("---------------------------------------------------------");
//        crud.insertStudent(4, "Marija", "Lazic");
//        crud.insertStudent(5, "Ognjen", "Radivojevic");
//        crud.insertStudent(6, "Srdjan", "Djindjic");
//        crud.displayTableStudent();
        
        crud.deleteStudentById(5);
        crud.displayTableStudent();
        
    }
    
    public void insertStudent(int id, String firstName,String lastName){
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test","root","Tech09360851403");
            
            String query = "INSERT INTO student VALUES(?,?,?)";
            PreparedStatement pst = myConnection.prepareStatement(query);
            // Naseljavamo statement sa podacima koje zelimo da unesemo u tabelu
            pst.setInt(1, id);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            
            pst.executeUpdate();
            System.out.println("Succesfuly added row with data : \n| id - " + id + " | first_name - " + firstName + " | last_name - " + lastName + " |" );
            
            pst.close();
            myConnection.close();
        } catch (SQLException e) {
            System.out.println("Insertion Faild " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
    
    public void displayTableStudent(){
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
    
    public static ArrayList<Student> pupulateStudentList(){
        ArrayList<Student> studentList = new ArrayList<>();
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test","root","Tech09360851403");
            
            String query = "SELECT * FROM student";
            Statement st = myConnection.createStatement();
            
            ResultSet rs = st.executeQuery(query);
            // Student temp
            Student student;
            while (rs.next()) {                
                student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
                studentList.add(student);
            }

            myConnection.close();
        } catch (SQLException e) {
            System.out.println("Population Faild " + e.getLocalizedMessage());
            e.printStackTrace();
        }
        
        return studentList;
    } 
    
    public void updateStudent(int id, String firstName,String lastName){
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test","root","Tech09360851403");
            
            String query = "UPDATE student SET first_name = ?,last_name = ? WHERE id = " + id;
//            String query = "UPDATE student SET first_name = ?,last_name = ? WHERE id IN (1,2,3)"; // Test za executeUpdate return value
            PreparedStatement pst = myConnection.prepareStatement(query);
            
            pst.setString(1,firstName);
            pst.setString(2, lastName);
            
//            int test = pst.executeUpdate(); // Test za executeUpdate return value
//            System.out.println(test);

            if(pst.executeUpdate() > 0){
                System.out.println("Updated succesfuly");
            } else{
                System.out.println("Faild to update student");
            }
            
            pst.close();
            myConnection.close();
        } catch (SQLException e) {
            System.out.println("Update Faild " + e.getLocalizedMessage());
            e.printStackTrace();
        }
        
    }
    
    public void deleteStudentById(int id){
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test","root","Tech09360851403");
            
            String query = "DELETE FROM student WHERE id = " + id;
//            String query = "UPDATE student SET first_name = ?,last_name = ? WHERE id IN (1,2,3)"; // Test za executeUpdate return value
            PreparedStatement pst = myConnection.prepareStatement(query);

            if(pst.executeUpdate() > 0){
                System.out.println("Deeted succesfuly");
            } else{
                System.out.println("Faild to delete student");
            }
            
            pst.close();
            myConnection.close();
        } catch (SQLException e) {
            System.out.println("Delete faild" + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
