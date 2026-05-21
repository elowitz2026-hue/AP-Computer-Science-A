/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
public class Health extends Stat {
    public Health (int value) {
        super(value);
    }
    
    @Override 
    public void increase(int amount) {
        value += amount;
        
        if (value > 100) {
            value = 100;
        }
    }
    
    @Override
    public void decrease(int amount) {
        value -= amount;
        
        if (value < 0) {
            value = 0;
        }
    }
}
