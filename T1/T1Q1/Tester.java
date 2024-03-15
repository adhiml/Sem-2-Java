/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q1;


public class Tester {
    
    public static void main(String[] args) {
        
        Telephone phone [] = new Telephone [5];
        
        phone [0] = new Telephone ("03",79676300);
        phone [1] = new Telephone ("03",79676301);
        phone [2] = new Telephone ("03",79676302);
        phone [3] = new Telephone ("03",79676303);
        phone [4] = new Telephone ("03",79676304);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(phone[i].makeFullNumber());
        }
    }
}
