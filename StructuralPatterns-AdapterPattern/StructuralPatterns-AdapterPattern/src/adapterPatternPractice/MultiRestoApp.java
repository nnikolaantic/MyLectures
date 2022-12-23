/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterPatternPractice;

/**
 *
 * @author anticn
 */
public class MultiRestoApp implements IMultiRestoApp {

    @Override
    public void displayMenus(XmlData xmlData) {
        // Displays menus using XML data
        System.out.println("Displaying Menus using XML data...");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        // Displays recommendations using XML data
        System.out.println("Displaying Recommendations using XML data...");
    }

}