/*
 * Author Name: Mohit Saini
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class SavingsAccountImpl {
    public static void main ( String[] args ) {
        SavingsAccount savingsAccount = new SavingsAccount ( );
        System.out.println ( "accountHolderName = " + savingsAccount.AccountHolderName );
        System.out.println ( "accountNumber = " + savingsAccount.AccountNumber );
        System.out.println ( "accountStatus = " + savingsAccount.AccountStatus );
    
        savingsAccount.retrieveTheAccountBalance ( );
        savingsAccount.debitCash ( 50000.0 );
        savingsAccount.creditBalance ( 12034.50 );
    
    }
}
