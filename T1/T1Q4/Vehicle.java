/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q4;


public abstract class Vehicle {
    
    double maxSpeed;
    protected double currentSpeed;
    
    Vehicle (double max) {
        this.maxSpeed = max;
    }
    
    public abstract void accelerate ();
    
    public double getCurrentSpeed () {
        return currentSpeed;
    }
    
    public double getMaxSpeed () {
        return maxSpeed;
    }
    
    public void pedalToTheMetal (){
        do {
            accelerate();
        } while (currentSpeed != maxSpeed);
    }
    
}
