/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q4;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    ArrayList<Transaction> transaction;

    Account1() {

        this.annualInterestRate = 0.0;
        this.balance = 0.0;
        this.id = 0;
        this.dateCreated = new Date();  // Initialize dateCreated with current date
    }

    Account1(int id, double bal, double rate, String name) {

        this.annualInterestRate = rate;
        this.balance = bal;
        this.id = id;
        this.dateCreated = new Date();
        this.name = name;
        this.transaction = new ArrayList<>();
    }

    public void addTransactions(Transaction t) {
        this.transaction.add(t);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    public double GetAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDate() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public boolean withdraw(double withdrawal) {

        if (withdrawal <= balance) {
            balance -= withdrawal;
            Transaction newTransaction = new Transaction(withdrawal, balance, 'W');
            addTransactions(newTransaction);
            System.out.println(newTransaction.toString());
            return true;
        }

        return false;
    }

    public double deposit(double deposit) {
        balance += deposit;
        Transaction newTransaction = new Transaction(deposit, balance, 'D');
        addTransactions(newTransaction);
        System.out.println(newTransaction.toString());
        return balance;
    }

    public String toString() {

        return String.format("Account Holder: %s \nBalance: RM%.2f\nInterest Rate: %.2f \n",
                name, balance, getMonthlyInterest());
    }
}
