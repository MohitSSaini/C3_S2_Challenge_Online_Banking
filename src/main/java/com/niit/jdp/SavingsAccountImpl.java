/*
 * Author Name: Mohit Saini
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class SavingsAccountImpl {
    public static void main ( String[] args ) {
        SavingsAccount savingsAccount = new SavingsAccount ( );
    
        savingsAccount.retrieveTheAccountBalance ( );
        savingsAccount.debitCash ( 5000.0 );
        savingsAccount.creditBalance ( 10000 );
    
    }
}
