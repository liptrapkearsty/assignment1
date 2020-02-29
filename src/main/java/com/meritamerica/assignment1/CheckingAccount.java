package com.meritamerica.assignment1;
 public class CheckingAccount extends MeritAmericaBankApp {
       private double balance;
    private double 
   public CheckingAccount() {
        balance = 0.0;
    }
    CheckingAccount(double openingBalance) {
    }
    public double getBalance() {
        return balance;
    }
    double getInterestRate() {
        return balance + ;
    }
    public void withdraw(double amount) {
        if (amount<=balance) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    double futureValue(int years) {
        return 0;
    }
    public String toString() {
        return null;
  }
}

