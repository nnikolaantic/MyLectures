/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadePatternLecture;

/**
 *
 * @author anticn
 */
public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int acctNumToCheck) {
        if (acctNumToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }

}
