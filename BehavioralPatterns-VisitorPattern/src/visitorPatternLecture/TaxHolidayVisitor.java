/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorPatternLecture;

/**
 *
 * @author anticn
 */
import java.text.DecimalFormat;

// Concrete Visitor Class
public class TaxHolidayVisitor implements Visitor {

    // This formats the item prices to 2 decimal places
    DecimalFormat df = new DecimalFormat("#.##");

    // This is created so that each item is sent to the
    // right version of visit() which is required by the
    // Visitor interface and defined below
    public TaxHolidayVisitor() {
    }

    // Calculates total price based on this being taxed
    // as a liquor item
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .10) + liquorItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a tobacco item
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a necessity item
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }

}
