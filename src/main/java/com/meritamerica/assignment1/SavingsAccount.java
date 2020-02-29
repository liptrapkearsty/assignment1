package com.meritamerica.assignment1;
 
public class SavingsAccount extends MeritAmericaBankApp{
    
    private double balance;
    
    public SavingsAccount() {
        balance = 0.0;
    }
    
    SavingsAccount(double openingBalance) {
    }
    double getBalance() {
        return balance;
    }
    double getInterestRate() {
        return 0;
    }
    public void withdraw(double amount) {
        if (amount <= balance)
            balance = balance - amount;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    double futureValue(int years) {
        return 0;
    }
    String toString()
}
    
}
