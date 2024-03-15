/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q1;


public class Telephone {
    
    String areaCode;
    int number;
    static int numberOfTelephoneObject = 0;
    
    Telephone (String area, int number) {
        
        this.areaCode = area;
        this.number = number;
        numberOfTelephoneObject++;
    }
    
    public String getAreaCode (){
        return areaCode;
    }
    
    public void setAreaCode (String areaCode) {
        this.areaCode = areaCode;
    }
    
    public void setNumber (int number) {
        this.number = number;
    }
    
    public int getNumber () {
        return number;
    }
    
    public String makeFullNumber () {
        return String.format("%s-%s", this.areaCode, this.number);
    } 
}
