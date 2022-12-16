/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyPatternPractical;

/**
 *
 * @author anticn
 */
public class PaymentService {
    //    Ovo je jedan od nacina
//    public void processOrder(int cost) {
//        if("CreditCard".equals(paymentMethod)){
//            // Pop up get card details
//            CreditCard card = new CreditCard("cardNumber", "date", "cvv");
//            // Validate credit card ...
//            System.out.println("Paying " + getTotal() + " Using credit Card");
//            card.setAmount(card.getAmount() - getTotal());
//        }else if("PayPal".equals(paymentMethod){
//            // Pop up PayPal mail,password
//            String email = "...";
//            String pass = "..."
//            // Validate account  ...
//            System.out.println("Paying " + getTotal() + " Using PayPall");
//        }
//    }
    
    private int cost;
    private boolean includeDelivery = true;

    private PaymentStrategy strategy;

    public void processOrder(int cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
