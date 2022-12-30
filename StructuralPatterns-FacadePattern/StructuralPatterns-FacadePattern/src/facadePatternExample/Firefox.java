/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadePatternExample;

import java.sql.Connection;
import java.sql.Driver;

/**
 *
 * @author anticn
 */
public class Firefox {
//  public static Driver getFirefoxDriver() {
//    return null;
//  }

    public static Connection getFirefoxConnection() {
        Connection con = null;
        return con;
    }

    public static void generateHTMLReport(String test, Connection con) {
        System.out.println("Generating HTML Report for Firefox Driver");
    }

    public static void generateJUnitReport(String test, Connection con) {
        System.out.println("Generating JUNIT Report for Firefox Driver");
    }
}
