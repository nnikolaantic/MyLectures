/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadePatternExample;

import java.sql.Driver;

/**
 *
 * @author anticn
 */
public class FacadePatternExample {

  public static void main(String[] args) {
    String test = "CheckElementPresent";
    //Facade pattern sluzi da kanalise zahteve klijenta kroz jednu klasu na druge klase
    WebExplorerHelperFacade.generateReports("firefox", "html", test);
    WebExplorerHelperFacade.generateReports("firefox", "junit", test);
    WebExplorerHelperFacade.generateReports("chrome", "html", test);
    WebExplorerHelperFacade.generateReports("chrome", "junit", test);
  }

}