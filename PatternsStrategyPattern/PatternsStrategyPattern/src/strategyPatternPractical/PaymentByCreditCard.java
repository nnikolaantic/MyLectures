/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyPatternPractical;

/**
 *
 * @author anticn
 */
public class PaymentByCreditCard implements PaymentStrategy {
//    private CreditCard card;
//    
//    @Override
//    public void pay(int amount){ // Ovo mozemo takodje da razlozimo na 3 metode
////            // Pop up get card details
//            CreditCard card = new CreditCard("cardNumber", "date", "cvv");
////            // Validate credit card ...
//            System.out.println("Paying " + amount + " Using credit Card");
//            card.setAmount(card.getAmount() - amount);
//    }

    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect card details...
        card = new CreditCard("cardNumber", "expiryDate", "cvv");
        System.out.println("Collecting Card Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate credit card...
        System.out.println("Validating Card Info: " + card.getNumber() + " | " + card.getDate() + " | " + card.getCvv());
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);
        System.out.println("Bank balanc is now " + card.getAmount());
    }
    
}