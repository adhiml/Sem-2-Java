/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q4;

import java.util.Date;

public class Transaction {

    private double amount;
    private double balance;
    public String description;
    public char type;
    public Date date;

    Transaction(double a, double b, char type) {
        this.amount = a;
        this.balance = b;
        this.type = type;
        this.date = new Date();
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDescription() {

        if (this.type == 'w' || this.type == 'W') {
            return "Withdrawal of RM" + getAmount();
        }

        return "Deposit of RM " + getAmount();
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getType() {
        return this.type;
    }

    public void setAmount(double a) {
        this.amount = a;
    }

    public double getAmount() {
        return this.amount;
    }

    public Date getDate() {
        return this.date;
    }

    public String toString() {
        
        return String.format("\n\nType of Transaction: %c\nDescription: %s\nBalance after Transaction: RM%.2f  \nDate: %s",
                getType(),getDescription(), getBalance(), getDate());

    }
}
