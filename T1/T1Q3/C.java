/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q3;

 public class C { 
      public static void main(String[] args) { 
       Object[] o = {new A(), new B()}; 
       
       // it the class has toString method, doing this (below) will print the toString method
       // if don't have to string, nothing happen
       
       System.out.print(o[0]); 
       System.out.print(o[1]);    
       
       //AB
     } 
   } 
 
    class A extends B { 
        
        public void display () {
            System.out.println("HEHE");
        }
       public String toString() { 
           return "A"; 
        } 
   } 
 
    class B { 
        public String toString() { 
           return "B"; 
       }   
   } 
