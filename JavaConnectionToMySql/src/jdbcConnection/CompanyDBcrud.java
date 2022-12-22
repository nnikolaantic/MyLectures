/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import models.Employee;
import models.Student;

/**
 *
 * @author anticn
 */
public class CompanyDBcrud {

    String url = "jdbc:mysql://localhost:3306/ourdb";
    String username = "root";
    String password = "Tech09360851403";

    public static void main(String[] args) {
        CompanyDBcrud companyDB = new CompanyDBcrud();
//        companyDB.displayMultipleTableView5();
        companyDB.displayEmployeeTable();
//        companyDB.displayEmployee2();
    }

    public void displayMultipleTableView5() {
        try {
            Connection myConnection = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM multipletableview5";
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
                int salary = rs.getInt(4);

                System.out.println("| id - " + id + " | first_name - " + firstName + " | last_name - " + lastName + " | salary - " + salary + " |");

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

    public void displayEmployeeTable() {
        try {
            Connection myConnection = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM employee";
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
                Date birthdate = rs.getDate(4);
                String sex = rs.getString(5);
                int salary = rs.getInt(6);
                int superID = rs.getInt(7);
                int branchID = rs.getInt(8);

                System.out.println("| id - " + id + " | first_name - "
                        + firstName + " | last_name - " + lastName
                        + " | birthdate - " + birthdate
                        + " | sex - " + sex
                        + " | salary - " + salary
                        + " | superID - " + superID
                        + " | branchID - " + branchID
                        + " |");
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

    private ArrayList<Employee> pupulateEmployeeList() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        try {
            Connection myConnection = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM employee";
            Statement st = myConnection.createStatement();

            ResultSet rs = st.executeQuery(query);
            // Student temp
            Employee employee;
            while (rs.next()) {
                employee = new Employee(rs.getInt(1), rs.getString(2),
                         rs.getString(3), rs.getDate(4),
                         rs.getString(5), rs.getInt(6),
                         rs.getInt(7), rs.getInt(8));
                employeeList.add(employee);
            }

            myConnection.close();
        } catch (SQLException e) {
            System.out.println("Population Faild " + e.getLocalizedMessage());
            e.printStackTrace();
        }

        return employeeList;
    }

    public void displayEmployee2() {
        ArrayList<Employee> employeeList = pupulateEmployeeList();

        for (Employee employee : employeeList) {
            System.out.println("| id - " + employee.getId()
                    + " | first_name - " + employee.getFirstName()
                    + " | last_name - " + employee.getLastName()
                    + " | birthdate - " + employee.getBirthdate()
                    + " | sex - " + employee.getSex()
                    + " | salary - " + employee.getSalary()
                    + " | superID - " + employee.getSuperID()
                    + " | branchID - " + employee.getBranchID()
                    + " |");
        }
    }
}
