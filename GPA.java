/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
public class GPA extends Stat {
    public GPA (int value) {
        super(value);
    }
    
    @Override 
    public void increase(int amount) {
        value += amount;
        
        if (value > 5) {
            value = 5;
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
