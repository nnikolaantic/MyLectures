/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyPatternPractical;

/**
 *
 * @author anticn
 */
public interface PaymentStrategy {
//    void pay(int amount); pay mozemo da razlozimo u 3 celine
    
    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay(int amount);

}
