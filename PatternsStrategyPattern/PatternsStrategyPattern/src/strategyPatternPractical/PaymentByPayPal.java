/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyPatternPractical;

/**
 *
 * @author anticn
 */
public class PaymentByPayPal implements PaymentStrategy {
//    private String email;
//    private String password;
//    private int balance;
//
//    @Override
//    public void pay(int amount) { // ovo mozemo da razlozimo na 3 metode
//            // Pop up PayPal mail,password
//            String email = "...";
//            String pass = "...";
//            // Validate account  ...
//            System.out.println("Paying " + amount + " Using PayPall");
//            System.out.println(balance - amount);
//    }


    private String email;
    private String password;
    private int balance = 1000;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect PayPal mail and password...
        email = "PayPal Mail";
        password = "PayPal Password";
        System.out.println("Collecting PayPal Account Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate account...
        System.out.println("Validating PayPal Info: " + email + " " +  password);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal");
        System.out.println("Balance on your PayPal Account is now : " + (balance - amount));
    }

}