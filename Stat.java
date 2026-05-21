/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
public class Stat {
    protected int value;
    
    public Stat(int value) {
        this.value = value;
    }
    
    public void increase (int amount) {
        value += amount;
    }
    
    public void decrease (int amount) {
        value -= amount;
    }
    
    public int getValue() {
        return value;
    }
}
