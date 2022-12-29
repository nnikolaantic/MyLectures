/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompositePatternExample;

/**
 *
 * @author anticn
 */
public class Client {

  public static void main(String[] args) {
    CompositeAccount component = new CompositeAccount();

    component.addAccount(new DepositeAccount("DA001", 100));
    component.addAccount(new DepositeAccount("DA002", 150));
    component.addAccount(new SavingAccount("SA001", 200));
    float totalBalance = component.getBalance();
    System.out.println("Total Balance : " + totalBalance);
    
    CompositeAccount component1 = new CompositeAccount();

    component1.addAccount(new DepositeAccount("DA001", 100));
    component1.addAccount(new DepositeAccount("DA002", 150));
    component1.addAccount(new SavingAccount("SA001", 200));
    
    CompositeAccount component2 =  new CompositeAccount();
    
    component2.addAccount(component);
    component2.addAccount(component1);
    
    System.out.println(component2.getBalance());
  }

}