/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author sushrutnaik
 */
public class Bank {

    float balance;
    
     Bank(float amount) {
        balance = amount;
    }
   
        /**Method For Amount Deposit In Bank
         * @param amount Is The Amount Customers Want To Withdraw
         */
    public void deposit(float amount) {
        
        balance += amount;
    }
        /**
         *Method For Withdraw Amount From Bank Only If Balance Amount Is Greater Than 500
         * @param amount Is The Amount Customer Want To Withdraw 
         */
    public void withdraw(float amount) {
        if (amount < 500) {
            System.out.println("Insufficient bal");
        } else {
            balance -= amount;
        }
    }
        /**
         * Method To Display Remaining Balance In Account
         */
    public void display() {
        System.out.println("Balance is:" + balance);
    }
}