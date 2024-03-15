/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q5;


interface Account {
    
    public int deposit (int deposit);
    public boolean withdraw (int withdrawal);

}

public class BankAccount implements Account {
    
    int balance;
    
    BankAccount (int balance) {
        this.balance = balance;
    }
    
    @Override
    public int deposit (int deposit) {
        return balance += deposit;
    }
    
    @Override
    public boolean withdraw (int w) {
        
        if (w <= balance)
        {
            balance -= w;
            return true;
        }
        else
            return false;
    }
}
