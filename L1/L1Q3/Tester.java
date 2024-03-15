/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q3;


public class Tester {
    
    public static void main(String[] args) {
        
        Account acc = new Account (1122,20000,4.5);
        
        acc.deposit(3000);
        acc.withdraw(2500);
        System.out.println(acc.toString());
    }
}

