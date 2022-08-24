/*
 * Author Name: Mohit Saini
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class SavingsAccount {
    long AccountNumber;
    String AccountHolderName;
    double AccountBalance;
    String AccountStatus;
    
    public SavingsAccount ( ) {
        AccountNumber = 100150975026L;
        AccountHolderName = "Mohit saini";
        AccountBalance = 157003.00;
        AccountStatus = "Active";
    }
    
    public void retrieveTheAccountBalance ( ) {
        System.out.println ( "Total AccountBalance in your account : =" + AccountBalance );
    }
    
    public void debitCash ( double accountBalance ) {
        this.AccountBalance -= accountBalance;
        System.out.println ( "Total DebitBalance in your account : =" + accountBalance );
    }
    
    public void creditBalance ( double accountBalance ) {
        this.AccountBalance += accountBalance;
        System.out.println ( "Total CreditBalance in your account :" + accountBalance );
    }
    
}
