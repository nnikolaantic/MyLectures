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
public class WebExplorerHelperFacade {

    public static void generateReports(String explorer, String report, String test) {
        Connection con = null;
        switch (explorer) {
            case "firefox":
                con = Firefox.getFirefoxConnection();
                switch (report) {
                    case "html":
                        Firefox.generateHTMLReport(test, con);
                        break;
                    case "junit":
                        Firefox.generateJUnitReport(test, con);
                        break;
                }
                break;
            case "chrome":
                con = Chrome.getChromeConnection();
                switch (report) {
                    case "html":
                        Chrome.generateHTMLReport(test, con);
                        break;
                    case "junit":
                        Chrome.generateJUnitReport(test, con);
                        break;
                }
        }
    }
}
