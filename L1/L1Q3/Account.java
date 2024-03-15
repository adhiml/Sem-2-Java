/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q3;

import java.util.Date;


public class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    Account () {
        
        this.annualInterestRate = 0.0;
        this.balance = 0.0;
        this.id = 0;
        this.dateCreated = new Date();  // Initialize dateCreated with current date
    }
    
    Account (int id, double bal, double rate) {
        
        this.annualInterestRate = rate;
        this.balance = bal;
        this.id = id;
        this.dateCreated = new Date();
    }
    
    public void setId (int id) {
        this.id = id;
    }
    
    public int getId () {
        return this.id;
    }
    
    public void setBalance (double bal) {
        this.balance = bal;
    }
    
    public double getBalance () {
        return this.balance;
    }
    
    public void setAnnualInterestRate (double rate) {
        this.annualInterestRate = rate;
    }
    
    public double GetAnnualInterestRate () {
        return this.annualInterestRate;
    }
    
    public Date getDate () {
        return this.dateCreated;
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    
    public boolean withdraw (double withdrawal) { // can be optimized
        
        if (withdrawal <= balance){
            balance -= withdrawal;
            return true;
        }
        
        return false;
    }
    
    public double deposit (double deposit) {
        return balance += deposit;
    }
    
    public String toString () {
        return String.format("Balance: %.2f\nMonthly Interest: %.2f\nDate: %s",
                balance,getMonthlyInterest(), getDate ());
    }
    
}
