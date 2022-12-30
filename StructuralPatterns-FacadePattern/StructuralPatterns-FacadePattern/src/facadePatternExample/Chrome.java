/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadePatternExample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author anticn
 */
public class Chrome {

//    public static Driver getChromeDriver() {
//        return null;
//    }

    public static Connection getChromeConnection() {
        Connection con = null;
        return con;
    }

    public static void generateHTMLReport(String test, Connection con) {
        System.out.println("Generating HTML Report for Chrome Driver");
    }

    public static void generateJUnitReport(String test, Connection con) {
        System.out.println("Generating JUNIT Report for Chrome Driver");
    }
}
