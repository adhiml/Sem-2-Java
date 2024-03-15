/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q4;


public class Tester {
    public static void main(String[] args) {
        
        Account1 acc = new Account1 (1122,1000,1.5,"George");
        System.out.println(acc.toString());
        
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);
        
    }
}
